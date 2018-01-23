package com.niit.amkart.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import com.niit.amkart.model.User;
@Component
public interface UserDAO {

	public List<User> listUsers();
	public User getUser(String email);
	public void createUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(String email);
}
