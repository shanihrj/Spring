package com.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Daointerface.DaoInterface;
import com.app.ServiceI.ServiceI;
import com.app.model.User;
@Service
public class ServiceImpl implements ServiceI {

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
		
		return dao.delete(user);
	}
	@Override
	public User edit(User user) {
		// TODO Auto-generated method stub
		return dao.edit(user);
	}
	@Override
	public List<User> update(User user) {
		// TODO Auto-generated method stub
		return dao.update(user);
	}
	
	

}
