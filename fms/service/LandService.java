package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Land;

public interface LandService {
	Land getLand(String surveyNumber);// String ownerName
	Land addLand(Land land);//Land land
	Land updateLand(Land land);//Land land
	Land removeLandDetails(String surveyNumber);//String surveyNumber
	List<Land> getAllLands();
}
