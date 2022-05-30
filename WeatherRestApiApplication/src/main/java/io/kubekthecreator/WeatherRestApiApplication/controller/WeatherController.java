package io.kubekthecreator.WeatherRestApiApplication.controller;


import io.kubekthecreator.WeatherRestApiApplication.model.WeatherDto;
import io.kubekthecreator.WeatherRestApiApplication.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;


    @GetMapping("/weather")
    public WeatherDto getWeather() {
        return weatherService.getWeather();
    }

    @GetMapping("/surfing/{date}")
    public WeatherDto surfing(@PathVariable String date){
        return weatherService.surfing(date);
    }
}
