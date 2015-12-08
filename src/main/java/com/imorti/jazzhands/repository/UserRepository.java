package com.imorti.jazzhands.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.imorti.jazzhands.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
}