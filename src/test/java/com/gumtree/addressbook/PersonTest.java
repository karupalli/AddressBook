package com.gumtree.addressbook;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.gumtree.addressbook.model.Gender;
import com.gumtree.addressbook.model.Person;

public class PersonTest {

	@Test
	public void testZeroAge() {
		
		Person person = new Person("Bob Bobber", Gender.MALE, LocalDate.now());
		assertEquals(0,person.getAgeInDays());
	}

	@Test
	public void test245DaysAge() {
		
		Person person = new Person("Bob Bobber", Gender.MALE, LocalDate.now().plusDays(245) );
		assertEquals(245,person.getAgeInDays());
	}

	@Test
	public void testMale() {
		
		Person person = new Person("Bob Bobber", Gender.MALE, LocalDate.now().plusDays(245) );
		assertEquals(Gender.MALE,person.getGender());
	}

	
	@Test
	public void testFemale() {
		
		Person person = new Person("Rachel Bobber", Gender.FEMALE, LocalDate.now().plusDays(245) );
		assertEquals(Gender.FEMALE,person.getGender());
	}

}
