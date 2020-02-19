package com.restpractice.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restpractice.model.Response;

import com.restpractice.model.*;

@Path("/person")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class PersonServiceImpl implements PersonService {

	@Override
	public Response addPerson(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response deletePerson(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Path("/getPerson")
	@GET
	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		
		Person p = new Person("Nanny", 32, 123);
		return p;
	}

	@Override
	public Person[] getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

}
