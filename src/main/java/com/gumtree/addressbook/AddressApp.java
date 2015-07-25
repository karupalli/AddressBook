package com.gumtree.addressbook;

import java.time.temporal.ChronoUnit;

import com.gumtree.addressbook.domain.AddressBookBuilder;
import com.gumtree.addressbook.exceptions.WrongFileFormatException;
import com.gumtree.addressbook.model.AddressBook;
import com.gumtree.addressbook.model.Person;

/**
 * Address Book App
 *
 */
public class AddressApp 
{
    public static void main( String[] args )
    {
    	try {
    		
    		//Build a  address Book based on file
			AddressBook addressBook = new AddressBookBuilder().buildAddressBook(args[0]);
			
			//Finding out Males Size
			System.out.println("All Males size:"+ addressBook.getAllMales().size());
			
			
			//Who is the oldest
			System.out.println("Oldest person in addressBook:" + addressBook.getOldest().getName());
			
			//How much older Bull is than Paul
			Person bill = addressBook.getPersonByName("Bill McKnight");
			Person paul = addressBook.getPersonByName("Paul Robinson");
			
			if(bill != null && paul != null)
				System.out.println("Bill is "+ ChronoUnit.DAYS.between(bill.getDob(),paul.getDob()) + " days older than Paul");
			
			
		} catch (WrongFileFormatException e) {
			System.out.println("Wrong file or format..");
		}
    }
}
