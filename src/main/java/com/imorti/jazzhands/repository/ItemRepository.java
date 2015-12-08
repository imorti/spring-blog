package com.imorti.jazzhands.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imorti.jazzhands.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	
}