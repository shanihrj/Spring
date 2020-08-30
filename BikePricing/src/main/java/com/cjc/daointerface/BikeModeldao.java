package com.cjc.daointerface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cjc.model.BikeModel;
import com.cjc.model.Company;


public interface BikeModeldao extends CrudRepository<BikeModel, Integer> {
	public List<BikeModel> findAllBikeModelByCompany(Company company);

	public BikeModel findAll(String c);

}
