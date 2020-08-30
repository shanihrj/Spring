package com.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DaoA;
import com.dao.DaoC;
import com.dao.DaoM;
import com.model.Admin;
import com.model.Client;
import com.model.Manager;
import com.service.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	private DaoA daoa;
	@Autowired
	private DaoM daom;
	@Autowired
	private DaoC daoc;

	public DaoA getDaoa() {
		return daoa;
	}

	public void setDaoa(DaoA daoa) {
		this.daoa = daoa;
	}

	public DaoM getDaom() {
		return daom;
	}

	public void setDaom(DaoM daom) {
		this.daom = daom;
	}

	public DaoC getDaoc() {
		return daoc;
	}

	public void setDaoc(DaoC daoc) {
		this.daoc = daoc;
	}

	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return daoa.save(admin);
	}

	@Override
	public Manager saveManager(Manager manager) {
		// TODO Auto-generated method stub
		return daom.save(manager);
	}

	@Override
	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return daoc.save(client);
	}

	@Override
	public int checkRole(Manager manager) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkRole(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkRole(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Admin> login(Admin admin) {
		// TODO Auto-generated method stub
		Admin a=daoa.findAllByUnameAndPass(admin.getUsername(), admin.getPassword());
		if (a == null) {
			return null;

		} else {
			return (List<Admin>) daoa.findAll();
		}
		
	}

	@Override
	public List<Manager> login(Manager manager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> login(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAllInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
