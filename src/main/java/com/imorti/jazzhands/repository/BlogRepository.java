package com.imorti.jazzhands.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imorti.jazzhands.entity.Blog;
import com.imorti.jazzhands.entity.User;


public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByUser(User user);
}