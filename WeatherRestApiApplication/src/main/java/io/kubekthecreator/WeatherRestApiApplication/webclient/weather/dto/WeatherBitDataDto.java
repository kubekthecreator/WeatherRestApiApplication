package io.kubekthecreator.WeatherRestApiApplication.webclient.weather.dto;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class WeatherBitDataDto {
    private float temp;
    private float wind_spd;
    private String datetime;


}
