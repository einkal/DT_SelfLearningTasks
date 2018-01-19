package com.Dao;

import java.util.List;

import com.Model.User;

public interface UserDao 
{
	public List<User> getAllUSer();
	public User getUser(int index);

}
