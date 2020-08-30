package com.cjc.serviceinterface;

import java.util.List;

import com.cjc.model.BikeModel;
import com.cjc.model.Company;
import com.cjc.model.Country;
import com.cjc.model.State;

public interface serviceinterface {
	
	List<BikeModel> findAllBikeModelByCompany(Integer a);
	public List<State> findAllStateByCountry(Integer b);
	public BikeModel findAll(String c);
	BikeModel getSingleBikeInfo(String c);
	

}
