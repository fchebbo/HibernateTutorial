package com.fchebbo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Laptop l = session.load(Laptop.class, 53);
		System.out.println(l);
		session.getTransaction().commit();

	}

}
