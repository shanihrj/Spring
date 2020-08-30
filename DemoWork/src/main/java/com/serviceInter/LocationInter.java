package com.serviceInter;

import java.util.List;

import com.model.Location;

public interface LocationInter {
Location saveLocation(Location location);
Location updateLocation(Location location);
void deleteLocation(Location location);
//Location getLocationByName(String name);
Location getLocationById(int id);
List<Location>getAllLocations();
}
