package com.imorti.jazzhands.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imorti.jazzhands.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	
}