package com.niit.amkart.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.niit.amkart.abstractdao.AbstractDao;
import com.niit.amkart.dao.UserDAO;
import com.niit.amkart.model.User;
@Component
@Repository("userDAO")
public class UserDAOImpl extends AbstractDao implements UserDAO {

	@Autowired
    
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createUser(User user) {
		// TODO Auto-generated method stub
		persist(user);
		return ;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
