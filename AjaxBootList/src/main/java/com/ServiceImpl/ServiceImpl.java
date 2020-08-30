package com.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ServiceIn.ServiceInter;
import com.dao.ContryD;
import com.model.Country;

@Service
public class ServiceImpl implements ServiceInter{
  @Autowired
  private ContryD dao;
  
	public ContryD getDao() {
	return dao;
}

public void setDao(ContryD dao) {
	this.dao = dao;
}

	@Override
	public Country saveCountry(Country Country) {
		return dao.save(Country);
	}

}
