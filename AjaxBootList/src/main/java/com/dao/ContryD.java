package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.model.Country;

public interface ContryD extends CrudRepository<Country, Integer> {

}
