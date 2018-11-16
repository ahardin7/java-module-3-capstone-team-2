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
	public List<FavoritePark> getAllFavoriteParks() {
		List<FavoritePark> allFavoriteParks = new ArrayList<>();
		String sqlSelectAllReviews = "SELECT parkname, count(*) FROM survey_result JOIN park ON park.parkcode = survey_result.parkcode GROUP BY parkname ORDER BY count(*) DESC ,parkname ASC";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllReviews);
		while(results.next()) {
			FavoritePark favorite = new FavoritePark();
			favorite.setCount(results.getInt("count"));
			favorite.setParkName(results.getString("parkname"));
			allFavoriteParks.add(favorite);
		}
		return allFavoriteParks;
	}

	@Override
	public void save(Survey survey) {
		String sqlSaveSurvey = "INSERT INTO survey_result(parkcode, emailaddress, state, activitylevel) VALUES(?, ?, ?, ?)";
		jdbcTemplate.update(sqlSaveSurvey, survey.getParkCode(), survey.getEmailAddress(), survey.getState(), survey.getActivityLevel());
	}
	
	
}