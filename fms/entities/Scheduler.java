package com.cap.fms.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Scheduler")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Scheduler {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String schedulerId;
	private String schedulerName;
	private String schedulerContact;
	private String truckNumber;
		
}
