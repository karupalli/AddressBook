package com.gumtree.addressbook;

import junit.framework.TestCase;

import org.junit.Test;

import com.gumtree.addressbook.model.AddressBook;
import com.gumtree.addressbook.model.Gender;
import com.gumtree.addressbook.model.Person;

public class AddressBookTest extends TestCase {

	@Test
	public void testMalesCount()
	{
		AddressBook addressBook = new AddressBook();
		addressBook.addPerson(new Person("XYZ",Gender.MALE,"03/02/77"));
		addressBook.addPerson(new Person("XYZ1",Gender.MALE,"03/02/87"));
		addressBook.addPerson(new Person("XYZ2",Gender.MALE,"03/02/99"));
		addressBook.addPerson(new Person("XYZ3",Gender.FEMALE,"03/02/88"));
		
		assertEquals(3, addressBook.getAllMales().size());
	}
	
	@Test
	public void testMalesCountWIthEmptyList()
	{
		AddressBook addressBook = new AddressBook();		
		assertEquals(0, addressBook.getAllMales().size());
	}
	
		
	@Test
	public void testNoOldPerson()
	{
		AddressBook addressBook = new AddressBook();
		assertNull( addressBook.getOldest());
	}
	
	@Test
	public void testOldest()
	{
		AddressBook addressBook = new AddressBook();
		addressBook.addPerson(new Person("XYZ",Gender.MALE,"03/02/77"));
		addressBook.addPerson(new Person("XYZ1",Gender.MALE,"03/02/87"));
		addressBook.addPerson(new Person("XYZ2",Gender.MALE,"03/02/99"));
		
		assertEquals("XYZ", addressBook.getOldest().getName());
	}
	
	@Test
	public void testPersonByName()
	{
		AddressBook addressBook = new AddressBook();
		addressBook.addPerson(new Person("XYZ",Gender.MALE,"03/02/77"));
		addressBook.addPerson(new Person("XYZ1",Gender.MALE,"03/02/87"));
		addressBook.addPerson(new Person("XYZ2",Gender.MALE,"03/02/99"));
		addressBook.addPerson(new Person("XYZ3",Gender.FEMALE,"03/02/88"));
		
		assertEquals("XYZ", addressBook.getPersonByName("XYZ").getName());
	}	
	
	@Test
	public void testPersonByNameForNull()
	{
		AddressBook addressBook = new AddressBook();
			
		assertEquals(null, addressBook.getPersonByName("XYZ"));
	}
	
}


