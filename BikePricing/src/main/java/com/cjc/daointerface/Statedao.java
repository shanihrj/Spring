package com.cjc.daointerface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cjc.model.Country;
import com.cjc.model.State;

public interface Statedao extends CrudRepository<State, Integer> {
	public List<State> findAllStateByCountry(Country country) ;
	
}
