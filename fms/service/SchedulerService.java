package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Scheduler;

public interface SchedulerService {
	Scheduler getScheduler(String schedulerName);//String
	Scheduler addScheduler(Scheduler scheduler);//Scheduler
	Scheduler updateScheduler(Scheduler scheduler);//Scheduler
	Scheduler deleteScheduler(String schedulerName);//String
	List<Scheduler> getAllSchedulers();
}
