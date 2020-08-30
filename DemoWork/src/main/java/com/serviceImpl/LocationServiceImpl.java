package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoI.DaoInter;
import com.model.Location;
import com.serviceInter.LocationInter;
@Service
public class LocationServiceImpl implements LocationInter {
   @Autowired
	private DaoInter dao;
	public DaoInter getDao() {
	return dao;
}

public void setDao(DaoInter dao) {
	this.dao = dao;
}

	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return dao.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return dao.save(location);
		}

	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
		dao.delete(location);
	}

	
	/*public Location getLocationByName(String name) {
		// TODO Auto-generated method stub
		return dao.findOne(name);
	}
*/
	@Override
	public Location getLocationById(int id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
