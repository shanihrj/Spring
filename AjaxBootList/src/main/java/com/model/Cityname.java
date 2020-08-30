package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Cityname {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String cityname;
@ManyToOne@JoinColumn(name="sid")
private State state;

public State getState() {
	return state;
}
public void setState(State state) {
	this.state = state;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}

}
