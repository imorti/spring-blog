package com.imorti.jazzhands.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.imorti.jazzhands.entity.Blog;
import com.imorti.jazzhands.entity.Item;
import com.imorti.jazzhands.entity.User;
import com.imorti.jazzhands.repository.BlogRepository;
import com.imorti.jazzhands.repository.ItemRepository;
import com.imorti.jazzhands.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BlogRepository blogRepo;
	
	@Autowired
	private ItemRepository itemRepo;
	
	
	public List<User> findAll() {
		return userRepo.findAll();
	}


	public User findOne(int id) {
		return userRepo.findOne(id);
	}

	@Transactional
	public User findOneWithBlogs(int id) {
	
			User user = findOne(id);
			List<Blog> blogs = blogRepo.findByUser(user);
			
			for (Blog blog : blogs) {
			List<Item> items =	itemRepo.findByBlog(blog, new PageRequest(0, 10, Direction.DESC, "publishedDate"));
			blog.setItems(items);
			}
			
			user.setBlogs(blogs);
		
		return user;
	}
	
}
