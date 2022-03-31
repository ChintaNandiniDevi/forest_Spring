package com.cap.fms.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.fms.entities.Contract;

@Repository
public interface ContractDao extends JpaRepository<Contract, String>{
	Contract findByContractNumber(String contractNumber);//String
	//boolean addContract(Contract contract);//Land
	//boolean updateContract(Contract contract);//Land
	
	@Query("Delete from Contract where contractNumber=:contractNumber")
	Contract deleteByContractNumber(String contractNumber);//String
	//List<Contract> getAllContracts();
}