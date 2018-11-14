package com.techelevator.npgeek.model;

import java.util.List;

public interface ParkDao {

	List<Park> getAllParks();

	public Park getParkByCode(String parkCode);

	
	
}
