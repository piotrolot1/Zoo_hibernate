package com.model;

import java.util.Date;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
        session.beginTransaction();

        User user = new User();
 
        Address address = new Address();
        
        address.setIdAddress(1);
        address.setCity("Warsaw");
        address.setStreet("Kwiatowa");
        
        user.setUserId(1);
        user.setUsername("Mukesh");
        user.setCreatedBy("Google");
        user.setAddress(address);
        user.setCreatedDate(new Date());
 
        session.save(address);
        session.save(user);
        session.getTransaction().commit();
	}
}
