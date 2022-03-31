package com.cap.fms.service;

import java.util.List;


import com.cap.fms.entities.Contract;


public interface ContractService {
	Contract getContract(String contractNumber);
	Contract addContract(Contract contract);
	Contract updateContract(Contract contract);
	Contract deleteContract(String contractNumber);
	List<Contract> getAllContracts();
}