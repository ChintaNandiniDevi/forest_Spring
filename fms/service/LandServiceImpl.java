package com.cap.fms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import com.cap.fms.entities.Land;
import com.cap.fms.repository.ILandDao;



public class LandServiceImpl implements LandService {
	
	@Autowired
	ILandDao repo;
	
	public Land getLand(String surveyNumber) {
		Land land=repo.findBySurveyNumber(surveyNumber);
		return land;
	}

	@Transactional
	public Land addLand(Land land) {
		Land lan =repo.save(land);
		return lan;
	}

	@Transactional
	public Land updateLand(Land land) {
		Land lan =repo.save(land);
		return lan;
	}

	@Transactional
	public Land removeLandDetails(String surveyNumber) {
		Land lan =repo.deleteBySurveyNumber(surveyNumber);
		return lan;
	}

	public List<Land> getAllLands() {
		List<Land> landList=repo.findAll();
		return landList;
	}

}
