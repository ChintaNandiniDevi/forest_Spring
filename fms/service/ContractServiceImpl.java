package com.cap.fms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import com.cap.fms.repository.ContractDao;
import com.cap.fms.entities.Contract;

public class ContractServiceImpl implements ContractService {
	
	@Autowired
	ContractDao repo;
	
	
	public Contract getContract(String contractNumber) {
		Contract contract=repo.findByContractNumber(contractNumber);
		return contract;
	}

	@Transactional
	public Contract addContract(Contract contract) {
		Contract con =repo.save(contract);
		return con;
	}

	@Transactional
	public Contract updateContract(Contract contract) {
		Contract con =repo.save(contract);
		return con;
	}

	@Transactional
	public Contract deleteContract(String contractNumber) {
		Contract con =repo.deleteByContractNumber(contractNumber);
		return con;
	}

	public List<Contract> getAllContracts() {
		List<Contract> contractList=repo.findAll();
		return contractList;
	}
}