package edu.eci.arsw.weather.model;

public class Wind {
	private float speed;
	private float angle;
	public Wind(float speed, float angle) {
		this.speed = speed;
		this.angle = angle;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getAngle() {
		return angle;
	}
	public void setAngle(float angle) {
		this.angle = angle;
	}
	
}
