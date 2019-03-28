package edu.eci.arsw.weather.persistence;

import java.util.Set;

import edu.eci.arsw.weather.model.City;
import edu.eci.arsw.weather.model.Weather;

public interface CityPersistence {


	/**
	 * Returns all cities in cache
	 * @return a set with all the cities in cache
	 */
	public Set<City> getAllCities();
	
	/**
	 * Returns the city with the name provided
	 * @param name the name of the city
	 * @return a city
	 */
	public City getCityByName(String name);
	
	/**
	 * Returns the current weather information for a city
	 * @param cityName the name of the city
	 * @return the weather information for a city
	 */
	public Weather getCityWeather(String cityName);
	
	/**
	 * saves a city in cache
	 * @param city the city to be added
	 */
	public void saveCity(City city);
}
