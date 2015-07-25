package com.gumtree.addressbook.model;

import java.util.Date;

/**
 * Class to represent Person object
 * @author kiran
 *
 */
public class Person {

	private String name;
	private Gender gender;
	private Date dob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}
