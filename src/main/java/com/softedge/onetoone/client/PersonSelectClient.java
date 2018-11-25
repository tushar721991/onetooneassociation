package com.softedge.onetoone.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softedge.onetoone.model.Person;
import com.softedge.onetoone.model.Vehicle;
import com.softedge.onetoone.util.SessionFactoryProvider;

public class PersonSelectClient {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryProvider.getSessionFactory();
		Session session = factory.openSession();
		Person person = session.get(Person.class, 101);
		System.out.println(person.getVehicle().getVehicleName());
		session.close();
		factory.close();
	}
}
