package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Admin;

public interface IAdminService {
 Admin getAdmin(String adminName);//String
 Admin addAdmin(Admin admin);//Admin
 Admin updateAdmin(Admin admin);//Admin
 Admin deleteAdmin(String adminName);//String
 List<Admin> getAllAdmin();
 
}