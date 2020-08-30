package com.app.ServiceI;

import java.util.List;

import com.app.model.User;

public interface ServiceI {
	public int SaveUser(User user);
	public List<User> login(User user);

	public List<User> delete(User user);
public User edit(User user);
	
	public List<User> update(User user);
}
