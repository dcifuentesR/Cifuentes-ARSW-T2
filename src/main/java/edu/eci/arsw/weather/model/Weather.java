package edu.eci.arsw.weather.model;

public class Weather {
	
	private int id;
	private String summary;
	private String description;
	public Weather(int id, String summary, String description) {
		this.id = id;
		this.summary = summary;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
