package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Client;

public interface DaoC extends CrudRepository<Client, Integer> {
	Client findAllByUnameAndPass(String username, String password);
  

}
