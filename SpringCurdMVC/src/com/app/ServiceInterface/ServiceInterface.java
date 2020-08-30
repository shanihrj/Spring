package com.app.ServiceInterface;

import java.util.List;

import com.app.model.User;

public interface ServiceInterface {
public int SaveUser(User user);
public List<User> login(User user);

public List<User> delete(User user);
}
