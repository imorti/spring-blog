package com.imorti.jazzhands.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imorti.jazzhands.entity.Blog;


public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	
}