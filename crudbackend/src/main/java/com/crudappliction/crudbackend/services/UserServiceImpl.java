package com.crudappliction.crudbackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudappliction.crudbackend.dao.UserDao;
import com.crudappliction.crudbackend.model.User;

@Service 
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User addUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUser(Long userId) {

		return userDao.findById(userId).get();
	}

	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public User deleteUser(Long userId) {
		User user = userDao.findById(userId).get();
		userDao.delete(user);
		return user;
	}

}
