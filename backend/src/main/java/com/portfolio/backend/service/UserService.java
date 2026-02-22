package com.portfolio.backend.service;

import com.portfolio.backend.entity.User;

public interface UserService {
	
	User registerUser(User user);
	
	User findByUsername(String username);

}
