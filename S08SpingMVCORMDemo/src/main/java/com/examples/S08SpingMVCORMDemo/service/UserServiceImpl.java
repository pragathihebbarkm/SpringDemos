package com.examples.S08SpingMVCORMDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.S08SpingMVCORMDemo.exception.UserAlreadyExistsException;
import com.examples.S08SpringMVCORMDemo.dao.UserDao;
import com.examples.S08SpringMVCORMDemo.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Override
	@Transactional
	public int save(User user) throws UserAlreadyExistsException {
		
		if(userdao.findUser(user.getEmail()) != null) {
			throw new UserAlreadyExistsException(user.getEmail());
		}
		return userdao.create(user);
		
	}

	@Override
	public List<User> getUsers() {
		
		return userdao.findUsers();
		
	}

}
