package com.kgisl.hibercrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Retrieve {
    public static void main(String[] args) {
        SessionFactory sessionFactory=SessionFactoryProvider.provideSessionFactory();
        Session session=sessionFactory.openSession();
        Student s = session.get(Student.class,3);
        System.out.println("ID "+s.getId());
        System.out.println("Name "+s.getName());
        System.out.println("Designation "+s.getDesignation());
        System.out.println("Salary "+s.getSalary());
        System.out.println("Email "+s.getEmail());
    }
    
}
