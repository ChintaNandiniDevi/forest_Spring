package com.cap.fms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Land {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int landid;
	private String surveyNumber;
	private String ownerName;
	private String landArea;
}
