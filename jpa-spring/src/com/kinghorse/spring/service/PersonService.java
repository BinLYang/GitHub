package com.kinghorse.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kinghorse.spring.dao.PersonDao;
import com.kinghorse.spring.entities.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Transactional
	public void savePerson(Person person){
		personDao.save(person);
	}
}
