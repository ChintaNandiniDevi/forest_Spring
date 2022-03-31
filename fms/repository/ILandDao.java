package com.cap.fms.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.fms.entities.Land;

@Repository
public interface ILandDao extends JpaRepository<Land, Integer> {
	Land findBySurveyNumber(String surveyNumber);//String
	//boolean saveLand(Land land);//Land
	//	boolean	updateLand(Land land);//Land
	
	

	@Query("Delete from Land where surveyNumber=:surveyNumber")
	Land deleteBySurveyNumber(String surveyNumber);//String
	//List<Land> findAll();
	
}
