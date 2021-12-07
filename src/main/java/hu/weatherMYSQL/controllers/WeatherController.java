package hu.weatherMYSQL.controllers;

import hu.weatherMYSQL.domain.DailyWeather;
import hu.weatherMYSQL.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService service;



    @GetMapping("effects")
    public List<DailyWeather> getEffects(){
        return  service.getEffects();
    }
}
