package hu.weatherMYSQL.repositories;

import hu.weatherMYSQL.domain.DailyWeather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends JpaRepository<DailyWeather, Integer> {
}
