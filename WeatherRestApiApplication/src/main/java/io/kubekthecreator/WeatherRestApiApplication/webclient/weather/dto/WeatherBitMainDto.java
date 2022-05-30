package io.kubekthecreator.WeatherRestApiApplication.webclient.weather.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
public class WeatherBitMainDto {
    private ArrayList<WeatherBitDataDto> data;
    private String city_name;
    private Float lon;
    private Float lat;
}
