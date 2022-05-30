package io.kubekthecreator.WeatherRestApiApplication.model;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WeatherDto {
    private Float temperature;
    private Float windSpeed;
    private String datetime;
    private String city;
    private Float Latitude;
    private Float Longitude;
}
