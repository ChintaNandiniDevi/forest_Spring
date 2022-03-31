package com.cap.fms.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.fms.entities.Admin;

@Repository
public interface IAdminDao extends JpaRepository<Admin,Integer>{
 Admin findByAdminName(String adminName);
// boolean addAdmin(Admin admin);
// boolean updateAdmin(Admin admin);
 

	@Query("Delete from Orders where adminName=:adminName")
 Admin deleteByAdminName(String adminName);
 //List<Admin> getAllAdmins();
 
}
