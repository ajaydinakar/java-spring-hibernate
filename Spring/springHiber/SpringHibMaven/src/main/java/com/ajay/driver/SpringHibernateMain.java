package com.ajay.driver;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ajay.bean.Person;
import com.ajay.dao.PersonDaoImpl;

public class SpringHibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		PersonDaoImpl dao= context.getBean(PersonDaoImpl.class);
		
		Person person = new Person();
	person.setId(3);
		person.setName("karan"); person.setCountry("India");
		
		dao.save(person);
		
		System.out.println("***********************************************************Person::"+person);
		
		List<Person> list = dao.list();
		
		for(Person p : list){
			System.out.println("***************************************************Person List::"+p);
		}
		//close resources
		context.close();	
	}
}
