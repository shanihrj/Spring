package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Admin;

public interface DaoA extends CrudRepository<Admin, Integer> {
	Admin findAllByUnameAndPass(String username, String password);

}
