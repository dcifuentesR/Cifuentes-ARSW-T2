package edu.eci.arsw.weather.model;

public class Coordenates {
	
	private double lon;
	private double lat;
	
	
	public Coordenates(double d, double e) {
		this.lon = d;
		this.lat = e;
	}
	
	public double getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}

}
