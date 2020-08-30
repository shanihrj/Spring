package com.cjc.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.cjc.model.Country;

public interface Countrydao extends CrudRepository<Country, Integer> {

}
