package com.kinghorse.spring;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kinghorse.spring.entities.Person;
import com.kinghorse.spring.service.PersonService;

public class JPASpringTest {
	
	private ApplicationContext ctx = null;
	
	private PersonService personService;
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		personService = ctx.getBean(PersonService.class);
	}

	@Test
	public void testPersonSave(){
		Person person = new Person("JeryMi", "JeryMi@163.com", 20);
		
		personService.savePerson(person);
		
	}
	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		
		System.out.println(dataSource.getConnection());
	}

}
