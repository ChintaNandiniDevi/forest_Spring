package com.cap.fms.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.fms.entities.User;

@Repository
public interface ILoginDao extends JpaRepository<User, String> {
	//User login(String userName,String password);//String, String
	//User logout(User user);//User
	//User addUser(User user);//User

	
	@Query("Delete from User where userName=:userName")
	User deleteByUserName(String userId);//User
}
