package com.gumtree.addressbook.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to represent the address book
 * @author kiran
 *
 */
public class AddressBook {

	//List of the persons
	private List<Person> personList = new ArrayList<Person>();
	
	/**
	 * Adds person to address book
	 * @param person
	 */
	public void addPerson(Person person)
	{
		personList.add(person);
	}
	
	/**
	 * Return the oldest person in the address book
	 * @return Person
	 */
	public Person getOldest()
	{
		if(personList.isEmpty())
			return null;
		
		personList.sort(Comparator.comparing(p->p.getAge()));
		return personList.get(0);
	}
	
	
	/**
	 * returns all Males in the address book
	 * @return All males
	 */
	public List<Person> getAllMales()
	{
		return personList.stream()
			    .filter(p -> p.getGender() == Gender.MALE).collect(Collectors.toList());
	}
	
	public int getSize()
	{
		return personList.size();
	}
	
	/**
	 * Returns Person by Name
	 * @param name
	 * @return Person for the given name
	 */
	public Person getPersonByName(String name)
	{
		return personList.stream()
			    .filter(p -> p.getName().equals(name)).findFirst().orElse(null);
	}
	
}
