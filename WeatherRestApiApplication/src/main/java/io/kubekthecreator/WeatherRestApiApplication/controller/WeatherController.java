package io.kubekthecreator.WeatherRestApiApplication.controller;


import io.kubekthecreator.WeatherRestApiApplication.model.WeatherDto;
import io.kubekthecreator.WeatherRestApiApplication.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherDto getWeather(){
        return weatherService.getWeather();
    }
}
