package com.imorti.jazzhands.service;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imorti.jazzhands.entity.Blog;
import com.imorti.jazzhands.entity.Item;
import com.imorti.jazzhands.entity.Role;
import com.imorti.jazzhands.entity.User;
import com.imorti.jazzhands.repository.BlogRepository;
import com.imorti.jazzhands.repository.ItemRepository;
import com.imorti.jazzhands.repository.RoleRepository;
import com.imorti.jazzhands.repository.UserRepository;



@Service
public class InitDBService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@PostConstruct
	public void init() {
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		ArrayList<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Blog blogJazzHands = new Blog();
		blogJazzHands.setName("JazzHands");
		blogJazzHands.setUrl("http://feedsfeedburner.com/jazzhands?format=xml");
		blogJazzHands.setUser(userAdmin);
		blogRepository.save(blogJazzHands);
		
		Item itemInit = new Item();
		itemInit.setBlog(blogJazzHands);
		itemInit.setTitle("init blog");
		itemInit.setLink("http://www.jazzhands.com");
		itemInit.setPublishedDate(new Date());
		itemRepository.save(itemInit);
		
		Item item2 = new Item();
		item2.setBlog(blogJazzHands);
		item2.setTitle("secondo");
		item2.setLink("http://www.jazzhands.com");
		item2.setPublishedDate(new Date());
		itemRepository.save(item2);
		
	}

}
