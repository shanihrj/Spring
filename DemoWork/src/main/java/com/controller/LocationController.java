package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Location;
import com.serviceInter.LocationInter;

@Controller
public class LocationController {
	@Autowired
	LocationInter loctis;
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createlocation";
	}
@RequestMapping("/saveLoc")
public String saveLocation(@ModelAttribute("location")Location location,ModelMap map) {
	Location loctionsaved=loctis.saveLocation(location);
	String msg="Location Saved with id:-"+loctionsaved.getId();
	map.addAttribute("msg",msg);
	return "createlocation";
}
}
