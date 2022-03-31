package com.cap.fms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String contractNumber;
	private String deliveryPlace;
	private String deliveryDate;
	private String quantity;
    
	@OneToOne
	@JoinColumn(name="schedulerId", referencedColumnName="schedulerId")
	private Scheduler scheduler;
	
	@OneToOne
	@JoinColumn(name="customerId", referencedColumnName="customerId")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name="productId", referencedColumnName="productId")
	private Product product;
}