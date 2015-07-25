package com.gumtree.addressbook.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Class to represent Person object
 * @author kiran
 *
 */
public class Person {

	private String name;
	private Gender gender;
	private LocalDate dob;
	
	public Person()
	{
		//default
	}
	
	public Person(String name, Gender gender, LocalDate dob)
	{
		this.name=name;
		this.gender=gender;
		this.dob=dob;
	}
	
	public Person(String name, Gender gender, String dobString)
	{
		this.name=name;
		this.gender=gender;
		this.dob=LocalDate.parse(dobString.trim(),
				DateTimeFormatter.ofPattern("dd/MM/yy"));
	}
	
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	/**
	 * Returns age in days
	 * @return
	 */
	public long getAgeInDays()
	{
		return ChronoUnit.DAYS.between(LocalDate.now(), dob);
	}
	
	
}
