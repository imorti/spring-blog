package com.imorti.jazzhands.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imorti.jazzhands.entity.Blog;
import com.imorti.jazzhands.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	List<Item> findByBlog(Blog blog);
	
}