package hu.weatherMYSQL.services;

import hu.weatherMYSQL.domain.DailyWeather;
import hu.weatherMYSQL.repositories.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WeatherService {

        @Autowired
        private WeatherRepository repository;

    public List<DailyWeather> getEffects() {
        return repository.findAll();
    }
}

