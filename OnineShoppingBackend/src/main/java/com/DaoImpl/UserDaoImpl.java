package com.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import com.Dao.UserDao;
import com.Model.User;

public class UserDaoImpl implements UserDao {

	List<User> users;
	User user;
	public UserDaoImpl()
	{
		users=new ArrayList<User>();
		User user=new User("Robert","abc@gmail.com","abc123","male","908279722","India");
		users.add(user);
	}
	public List<User> getAllUSer() {
		// TODO Auto-generated method stub
		return users;
	}

	public User getUser(int index) {
		// TODO Auto-generated method stub
		return users.get(index);
	}

}
