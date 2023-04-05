package com.examples.S08SpingMVCORMDemo.service;

import java.util.List;

import com.examples.S08SpingMVCORMDemo.exception.UserAlreadyExistsException;
import com.examples.S08SpringMVCORMDemo.entity.User;

public interface UserService {

	int save(User user) throws UserAlreadyExistsException;
	
	List<User> getUsers();
}
