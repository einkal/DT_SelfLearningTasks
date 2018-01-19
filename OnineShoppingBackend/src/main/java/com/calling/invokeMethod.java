package com.calling;

import com.Dao.UserDao;
import com.DaoImpl.UserDaoImpl;
import com.Model.User;

public class invokeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDaoImpl();
		User user=userDao.getUser(0);
		System.out.println(user.getName()+" "+user.getPassword());

	}

}
