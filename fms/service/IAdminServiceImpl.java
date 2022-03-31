package com.cap.fms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cap.fms.entities.Admin;
import com.cap.fms.repository.IAdminDao;

public class IAdminServiceImpl implements IAdminService {

	@Autowired
	IAdminDao repo;
	
	
	public Admin getAdmin(String adminName) {
		Admin admin=repo.findByAdminName(adminName);
		return admin;
	}

	@Transactional
	public Admin addAdmin(Admin admin) {
		Admin ad=repo.save(admin);
		return ad;
	}

	@Transactional
	public Admin updateAdmin(Admin admin) {
		Admin ad=repo.save(admin);
		return ad;
	}

	@Transactional
	public Admin deleteAdmin(String adminName) {
		Admin ad=repo.deleteByAdminName(adminName);
		return ad;
	}

	public List<Admin> getAllAdmin() {
		List<Admin> adminList=repo.findAll();
		return adminList;
	}

}
