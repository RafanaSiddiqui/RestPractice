package com.restpractice.service;

import com.restpractice.model.Person;
import com.restpractice.model.Response;


public interface PersonService {

	
	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson();
	
	public Person[] getAllPersons();
	
	
}
