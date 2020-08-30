package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.daointerface.BikeModeldao;
import com.cjc.daointerface.Companydao;
import com.cjc.daointerface.Countrydao;
import com.cjc.daointerface.Statedao;
import com.cjc.model.BikeModel;
import com.cjc.model.Company;
import com.cjc.model.Country;
import com.cjc.model.State;
import com.cjc.serviceinterface.serviceinterface;
@Service
public class serviceimpl implements serviceinterface {

@Autowired
Statedao sdao;
@Autowired
Countrydao codao;
@Autowired
Companydao cdao;
@Autowired
BikeModeldao bdao;
@Override
public List<State> findAllStateByCountry(Integer b) {
	Country c=codao.findOne(b);
	System.out.println(c.getCountryname());
	
	List<State> list=sdao.findAllStateByCountry(c);
	
	return list;
}
@Override
public List<BikeModel> findAllBikeModelByCompany(Integer a) {
	// TODO Auto-generated method stub
	Company cp=cdao.findOne(a);
	List<BikeModel> list=bdao.findAllBikeModelByCompany(cp);
	return list;
}
@Override
public BikeModel getSingleBikeInfo(String c) {
	// TODO Auto-generated method stub
	return bdao.findAll(c);
}
@Override
public BikeModel findAll(String c) {
	// TODO Auto-generated method stub
	return bdao.findAll(c);
}

}


