package com.gumtree.addressbook.model;

/**
 * Represents different genders
 * @author kiran
 *
 */
public enum Gender {
	MALE ("Male"),
	FEMALE ("Female");
	
	private String genderName;
	
	private Gender(String genderName)
	{
		this.genderName=genderName;
	}
}
