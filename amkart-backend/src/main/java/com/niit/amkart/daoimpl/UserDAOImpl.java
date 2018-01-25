package com.niit.amkart.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.amkart.dao.UserDAO;
import com.niit.amkart.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<User> list() {
		
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public User get(String username) {
		
		return (User)sessionFactory.getCurrentSession().createQuery("from User where username='"+username+"'").uniqueResult();
	}

	public boolean save(User user) {
		sessionFactory.getCurrentSession().save(user);
		sessionFactory.getCurrentSession().flush();
		return true;
	}

	public boolean update(User user) {
		sessionFactory.getCurrentSession().update(user);
		return true;
	}

	public boolean delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
		return true;
	}

	

}
