package com.crudappliction.crudbackend.services;



import java.util.List;
import com.crudappliction.crudbackend.model.User;




public interface UserService {
	public User addUser(User user);

	public List<User> getUsers();

	public User getUser(Long userId);

	public User updateUser(User user);

	public User deleteUser(Long userId);
}
