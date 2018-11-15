package com.techelevator.npgeek.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcSurveyDao implements SurveyDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcSurveyDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
		
	}

	@Override
	public List<Survey> getAllSurveys() {
		List<Survey> allSurveys = new ArrayList<>();
		String sqlSelectAllReviews = "SELECT * FROM survey_result";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllReviews);
		while(results.next()) {
			Survey survey = new Survey();
			populateSurvey(results, survey);
			allSurveys.add(survey);
		}
		return allSurveys;
	}

	private void populateSurvey(SqlRowSet results, Survey survey) {
		survey.setParkCode(results.getString("parkcode"));
		survey.setEmailAddress(results.getString("emailaddress"));
		survey.setState(results.getString("state"));
		survey.setActivityLevel(results.getString("activitylevel"));
	}

	@Override
	public void save(Survey survey) {
		// TODO Auto-generated method stub
		
	}
}