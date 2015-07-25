package com.gumtree.addressbook.domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

import com.gumtree.addressbook.exceptions.WrongFileFormatException;
import com.gumtree.addressbook.model.AddressBook;
import com.gumtree.addressbook.model.Gender;
import com.gumtree.addressbook.model.Person;

/**
 * Builds address book
 * 
 * @author kiran
 *
 */
public class AddressBookBuilder {

	/**
	 * Builds address book from given file name.
	 * 
	 * @return
	 */
	public AddressBook buildAddressBook(String fileName)
			throws WrongFileFormatException {
		
		AddressBook addressBook = new AddressBook();
		Stream<String> lines = null;

		try {

			Path path = Paths.get(fileName);
			
			//Check whether file exists
			if (!Files.exists(path)) {
				throw new WrongFileFormatException();
			}

			lines = Files.lines(Paths.get(fileName));

			//Read each line and build a person out of it
			lines.forEach(line -> {
				String[] words = line.split(",");
				Person person = buildPerson(words);
				if (person != null)
					addressBook.addPerson(person);
			});

		} catch (IOException e) {
			// Some problem reading file.
			throw new WrongFileFormatException();
		} finally {
			if (lines != null)
				lines.close();
		}

		return addressBook;
	}

	/**
	 * Builds person for each line in the file
	 * 
	 * @param words
	 * @return
	 */
	private Person buildPerson(String[] words) {
		Person person = new Person();
		person.setName(words[0]);
		person.setGender(Gender.find(words[1]));
		person.setDob(LocalDate.parse(words[2].trim(),
				DateTimeFormatter.ofPattern("dd/MM/yy")));
		person.setName(words[0]);
		return person;

	}

}
