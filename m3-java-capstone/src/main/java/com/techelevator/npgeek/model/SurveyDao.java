package com.techelevator.npgeek.model;

import java.util.List;

public interface SurveyDao {

	List<Survey> getAllSurveys();
	void save(Survey survey);

	
	
}
