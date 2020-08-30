package com.service;

import java.util.List;

import com.model.Admin;
import com.model.Client;
import com.model.Manager;

public interface ServiceI {
	Admin saveAdmin(Admin admin);
	Manager saveManager(Manager manager);
	Client saveClient(Client client);
	public int checkRole(Manager manager);
	public int checkRole(Admin admin);
	public int checkRole(Client client);
	List<Admin> login(Admin admin);
	List<Manager> login(Manager manager);
	List<Client> login(Client client);
	List<Admin> getAllInfo();
}
