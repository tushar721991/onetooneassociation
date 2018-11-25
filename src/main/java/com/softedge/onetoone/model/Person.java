package com.softedge.onetoone.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="people")
public class Person {
	@Id
	private int personId;
	private String personName;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String personName, Vehicle vehicle) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.vehicle = vehicle;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
}
