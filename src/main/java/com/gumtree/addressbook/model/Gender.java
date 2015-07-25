package com.gumtree.addressbook.model;

import java.util.Arrays;

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
	
	public static Gender find(String val) {
			   return Arrays.stream(Gender.values())
		        .filter(e -> e.genderName.equals(val.trim()))
		        .findAny()
		        .orElseThrow(() -> new IllegalStateException(String.format("Unsupported gender name %s.", val)));
	
		}
}
