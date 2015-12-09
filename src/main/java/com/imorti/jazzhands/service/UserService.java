package com.imorti.jazzhands.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imorti.jazzhands.entity.User;
import com.imorti.jazzhands.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepo;
	
	
	public List<User> findAll() {
		return userRepo.findAll();
	}


	public User findOne(int id) {
		return userRepo.findOne(id);
	}
	
}
