package io.kubekthecreator.WeatherRestApiApplication.webclient.weather;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class WeatherClient {

    public static final String WEATHER_URL = "https://api.weatherbit.io/v2.0/forecast/daily";
    public static final String APIKEY = "dd836a189ea14577b4b2fbb872f17e1c";
    private RestTemplate restTemplate = new RestTemplate();

    public String getWeatherForCity(final String city) {
        return city + callGetMethod("?city={city}&key={apiKey}",
                String.class,
                city, APIKEY);
    }

    private <T> T callGetMethod(String url, final Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(WEATHER_URL + url,
                responseType, objects);
    }
}
