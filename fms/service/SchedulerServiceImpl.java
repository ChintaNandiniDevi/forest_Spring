package com.cap.fms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cap.fms.entities.Scheduler;
import com.cap.fms.repository.ISchedularDao;


public class SchedulerServiceImpl implements SchedulerService {

	@Autowired
	ISchedularDao repo;
	

	public Scheduler getScheduler(String schedulerName ) {
		Scheduler scheduler= repo.findByShedulerName(schedulerName);
		return scheduler;
	}

	@Transactional
	public Scheduler addScheduler(Scheduler scheduler) {
		Scheduler sched= repo.save(scheduler);
		return sched;
	}

	@Transactional
	public Scheduler updateScheduler(Scheduler scheduler) {
		Scheduler sched= repo.save(scheduler);
		return sched;
	}

	@Transactional
	public Scheduler deleteScheduler(String schedulerName) {
		Scheduler sched= repo.deleteBySchedulerName(schedulerName);
		return sched;
	}

	public List<Scheduler> getAllSchedulers() {
		List<Scheduler> schedulerList=repo.findAll();
		return schedulerList;
	}

}
