package edu.eci.arsw.weather.persistence;

import java.util.Set;

import edu.eci.arsw.weather.model.City;
import edu.eci.arsw.weather.model.Weather;

public interface CityPersistence {


	public Set<City> getAllCities();
	public City getCityByName(String name);
	public Weather getCityWeather(String cityName);
	public void saveCity(City city);
}
