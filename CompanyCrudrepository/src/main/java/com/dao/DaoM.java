package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Manager;

public interface DaoM extends CrudRepository<Manager, Integer> {
	Manager findAllByUnameAndPass(String username, String password);

}
