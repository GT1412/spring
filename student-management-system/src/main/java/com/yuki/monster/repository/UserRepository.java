package com.yuki.monster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yuki.monster.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	User findByUserId(String userId);

}
