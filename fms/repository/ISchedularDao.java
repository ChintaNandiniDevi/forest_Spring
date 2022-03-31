package com.cap.fms.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.fms.entities.Scheduler;

@Repository
public interface ISchedularDao extends JpaRepository<Scheduler, String>{
	Scheduler findByShedulerName(String schedulerName);//String
	//boolean saveScheduler(Scheduler scheduler);//Scheduler
	//boolean updateScheduler(Scheduler scheduler);//Scheduler
	
	
	@Query("Delete from Scheduler where schedulerName=:schedulerName")
	Scheduler deleteBySchedulerName(String  schedulerName);//String
	//List<Scheduler> findAll();
}
