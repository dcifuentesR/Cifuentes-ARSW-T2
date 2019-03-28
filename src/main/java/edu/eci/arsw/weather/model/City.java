package edu.eci.arsw.weather.model;

public class City {
	
	private String name;
	private String id;
	private String country;
	
	private Coordenates coordenates;
	private Weather currentWeather;

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Coordenates getCoordenates() {
		return coordenates;
	}

	public void setCoordenates(Coordenates coordenates) {
		this.coordenates = coordenates;
	}

	public Weather getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(Weather currentWeather) {
		this.currentWeather = currentWeather;
	}

}
