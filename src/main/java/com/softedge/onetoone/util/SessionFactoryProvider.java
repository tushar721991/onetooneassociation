package com.softedge.onetoone.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.softedge.onetoone.model.Person;
import com.softedge.onetoone.model.Vehicle;

public class SessionFactoryProvider {

	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	static {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure().build();
		sessionFactory = new MetadataSources(registry)
				.addAnnotatedClass(Person.class)
				.addAnnotatedClass(Vehicle.class)
				
				.buildMetadata().buildSessionFactory();
	}
}
