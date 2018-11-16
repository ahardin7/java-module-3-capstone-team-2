package com.techelevator.npgeek.model;

public class Convert {
	private String units;
	private int high;
	private int low;
	private int highC;
	private int lowC;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Convert(int high, int low) {
		this.high = high;
		this.low = low;
		if(units.equals("celsius")) {
			highC = convertToC(high);
			lowC = convertToC(low);
		
	}
	}
	
	
	
	
	private int convertToC(int f) {
		int c =0;
		
		return 0;
	}





	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getHighC() {
		return highC;
	}
	public void setHighC(int highC) {
		this.highC = highC;
	}
	public int getLowC() {
		return lowC;
	}
	public void setLowC(int lowC) {
		this.lowC = lowC;
	}	
	
	
}
