package io.kubekthecreator.WeatherRestApiApplication.service;

import io.kubekthecreator.WeatherRestApiApplication.model.WeatherDto;
import io.kubekthecreator.WeatherRestApiApplication.webclient.weather.WeatherClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;
    public WeatherDto getWeather() {
        String response = weatherClient.getWeatherForCity("Jastarnia");
        log.info(response);
        return null;
    }

}
