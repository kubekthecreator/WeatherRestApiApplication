package io.kubekthecreator.WeatherRestApiApplication.webclient.weather;

import io.kubekthecreator.WeatherRestApiApplication.model.WeatherDto;
import io.kubekthecreator.WeatherRestApiApplication.webclient.weather.dto.WeatherBitMainDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Component
@Slf4j
public class WeatherClient {
    @Autowired
    private RestTemplate restTemplate;


    public static final String WEATHER_URL = "https://api.weatherbit.io/v2.0/forecast/daily";
    public static final String APIKEY = "dd836a189ea14577b4b2fbb872f17e1c";


    public WeatherDto validateBestLocation(String date){
        List<WeatherDto> temp = new ArrayList<>();
        List<WeatherDto> allCities = new ArrayList<>();
        allCities = pushCities(date);
        float max = 0;
        WeatherDto theBest = null;
        for(WeatherDto val : allCities){
            if((val.getTemperature()>5 && val.getTemperature()<35) && (val.getWindSpeed()>5 && val.getWindSpeed()<18)){
                temp.add(val);
            }
        }

        for(WeatherDto val : temp){
            if(val.getWindSpeed() * 3 + val.getTemperature() > max)
                theBest = val;
        }
        return theBest;
    }

    public List<WeatherDto> pushCities(final String date) {
        List<String> allCities = new ArrayList<>();

        List<WeatherDto> allWeathersOfCities = new ArrayList<>();

        allCities.add("Jastarnia");
        allCities.add("BridgeTown");
        allCities.add("Fortaleza");
        allCities.add("Pissouri");
        allCities.add("Le Morne");

        for (String city: allCities) {
            WeatherDto weatherOfCity = getWeatherForCity(date,city);
            allWeathersOfCities.add(weatherOfCity);
        }
        return allWeathersOfCities;
    }

    public WeatherDto getWeatherForCity(String date, String city) {
        WeatherBitMainDto openWeatherWeatherDto = callGetMethod("?city={city}&key={apiKey}",
                WeatherBitMainDto.class,
                city, APIKEY);

        //String test = "2022-05-30";

        return   WeatherDto.builder()
                .city(openWeatherWeatherDto.getCity_name())
                .datetime(openWeatherWeatherDto.getData().stream()
                        .filter(val -> val.getDatetime().equals(date))
                        .map(val -> val.getDatetime())
                        .findFirst().orElse(""))
                .temperature(openWeatherWeatherDto.getData().stream()
                        .filter(val -> val.getDatetime().equals(date))
                        .map(val -> val.getTemp())
                        .findFirst().orElse(0F))
                .windSpeed(openWeatherWeatherDto.getData().stream()
                        .filter(val -> val.getDatetime().equals(date))
                        .map(val -> val.getWind_spd())
                        .findFirst().orElse(0F)
                )
                .Longitude(openWeatherWeatherDto.getLon())
                .Latitude(openWeatherWeatherDto.getLat())
                .build();
    }

    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(WEATHER_URL + url,
                responseType, objects);
    }
}
