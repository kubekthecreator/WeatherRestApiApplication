package io.kubekthecreator.WeatherRestApiApplication.service;

import io.kubekthecreator.WeatherRestApiApplication.model.WeatherDto;
import io.kubekthecreator.WeatherRestApiApplication.webclient.weather.WeatherClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;
    public WeatherDto getWeather() {
        return (weatherClient.getWeatherForCity("2022-05-30", "Jastarnia"));
    }

    public WeatherDto surfing(String date){
        return weatherClient.validateBestLocation(date);
    }

}
