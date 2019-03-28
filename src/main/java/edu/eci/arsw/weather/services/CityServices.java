package edu.eci.arsw.weather.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.weather.model.City;
import edu.eci.arsw.weather.model.Weather;
import edu.eci.arsw.weather.persistence.CityPersistence;

@Service
public class CityServices {
	
	@Autowired
	private CityPersistence cp;
	
	public void addNewCity(City city) {
		cp.saveCity(city);
	}
	public Set<City> getAllCities() {
		return cp.getAllCities();
	}
	public City getCityByName(String cityName) {
		return cp.getCityByName(cityName);
	}
	public Weather getCityWeather(String cityName) {
		return cp.getCityWeather(cityName);
	}
	

}
