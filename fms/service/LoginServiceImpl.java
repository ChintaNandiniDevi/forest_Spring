package com.cap.fms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cap.fms.entities.User;
import com.cap.fms.repository.ILoginDao;

public class LoginServiceImpl implements LoginService {

	@Autowired
	ILoginDao repo;
//	public User login(String userName, String password) {
//		User user =repo.findByUserNameAndPassword();
//		return user;
//	}

//	public User logout() {
//		User user =repo.save(land);
//		return lan;
//	}

	public User addUser(User user) {
		User us =repo.save(user);
		return us;
	}

	public User removeUser(String userName) {
		User us =repo.deleteByUserName(userName);
		return us;
	}

}
