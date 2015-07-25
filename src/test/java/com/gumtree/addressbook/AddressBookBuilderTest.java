package com.gumtree.addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gumtree.addressbook.domain.AddressBookBuilder;
import com.gumtree.addressbook.exceptions.WrongFileFormatException;
import com.gumtree.addressbook.model.AddressBook;

public class AddressBookBuilderTest {

	@Test(expected = WrongFileFormatException.class)
	public void testNullAddressBook() throws WrongFileFormatException {
		
		AddressBookBuilder addressBookBuilder = new AddressBookBuilder();
		AddressBook addressBook = addressBookBuilder.buildAddressBook(null);
	}
	
	@Test
	public void testAddressBook() throws WrongFileFormatException
	{
		AddressBookBuilder addressBookBuilder = new AddressBookBuilder();
		AddressBook addressBook = addressBookBuilder.buildAddressBook("src/data/AddressBook");
		
		assertEquals(5,addressBook.getSize());
	}
	
	
}
