package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity

public class State {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int sid;
private String sname;
@ManyToOne@JoinColumn(name="cid")
private Country country;
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}

}
