package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class BikeModel {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private String bikeModelName;
    private String year;
    @ManyToOne(cascade=CascadeType.ALL)
    private Company company;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBikeModel() {
		return bikeModelName;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModelName = bikeModel;
	}
	
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}

}
