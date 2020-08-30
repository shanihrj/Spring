package com.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DaoInterface.DaoInterface;
import com.app.ServiceInterface.ServiceInterface;
import com.app.model.User;
@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	DaoInterface dao;
	public int SaveUser(User user) {
	 System.out.println(user.getName());
	
		return dao.SaveUser(user);
	}
	@Override
	public List<User> login(User user)
	{
		return dao.login(user);
		
	}
	@Override
	public List<User> delete(User user) {
		// TODO Auto-generated method stub
		return dao.delete(user);
	}
	
	

}
