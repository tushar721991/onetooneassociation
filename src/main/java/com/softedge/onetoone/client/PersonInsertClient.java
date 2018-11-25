package com.softedge.onetoone.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softedge.onetoone.model.Person;
import com.softedge.onetoone.model.Vehicle;
import com.softedge.onetoone.util.SessionFactoryProvider;

public class PersonInsertClient {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryProvider.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Vehicle vehicle = new Vehicle(1234, "4 wheeler", "BMW");
		Person person = new Person(101, "John Doe", vehicle);
		session.save(vehicle);
		session.save(person);
		tx.commit();
		session.close();
		factory.close();
	}
}
