package com.techelevator.npgeek.model;

public class Weather {
	
	private String 		parkCode;
	private int 		day;
	private int 		low;
	private int 		high;
	private String  	forecast;
	private Advisory	advisory;
	
	
	
	
	
	public String getParkCode() {
		return parkCode;
	}
	public int getDay() {
		return day;
	}
	public int getLow() {
		return low;
	}
	public int getHigh() {
		return high;
	}
	public String getForecast() {
		return forecast;
	}
	public void setParkCode(String parkCode) {
		this.parkCode = parkCode;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
	public Advisory getAdvisory() {
		return advisory;
	}
	public void setAdvisory(Advisory advisory) {
		this.advisory = advisory;
	}
	
	
	
}
