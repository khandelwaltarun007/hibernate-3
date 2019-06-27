package com.hibernate.hibernate_3;


import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	final static Logger logger = Logger.getLogger("Test");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee employee = new Employee("Tarun","pune",true);
		Users users = new Users("tarun", "khandelwal", "tarkhand", "123", true, employee);
		Configuration cfg = new Configuration().configure();
		Session session = cfg.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		//session.save(employee);
		//session.save(users);
		tx.commit();
		session.getSessionFactory().close();
		logger.info("saved.");
	}

}