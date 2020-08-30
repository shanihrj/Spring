package com.cjc.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.cjc.model.Company;

public interface Companydao extends CrudRepository<Company, Integer> {

}
