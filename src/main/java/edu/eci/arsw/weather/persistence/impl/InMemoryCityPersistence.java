package edu.eci.arsw.weather.persistence.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import edu.eci.arsw.weather.model.City;
import edu.eci.arsw.weather.model.Coordenates;
import edu.eci.arsw.weather.model.Weather;
import edu.eci.arsw.weather.persistence.CityPersistence;

public class InMemoryCityPersistence implements CityPersistence {
	
	private Map<String,City> cities = new HashMap<>();
	
	public InMemoryCityPersistence() {
		Coordenates coordenates=new Coordenates(-0.13, 51.51);
		Weather weather = new Weather(0, "Drizzle", "");
		City city1= new City("London", "1234", "GB", coordenates, weather);
		City city2= new City("Paris", "12345", "FR", coordenates, weather);
		
		cities.put("London", city1);

		cities.put("London", city2);
	}

	@Override
	public Set<City> getAllCities() {
		
		return new HashSet<>(cities.values());
	}

	@Override
	public City getCityByName(String name) {
		// TODO Auto-generated method stub
		return cities.get(name);
	}

	@Override
	public Weather getCityWeather(String cityName) {
		return cities.get(cityName).getCurrentWeather();
	}

	@Override
	public void saveCity(City city) {
		cities.put(city.getName(), city);
	}

}
