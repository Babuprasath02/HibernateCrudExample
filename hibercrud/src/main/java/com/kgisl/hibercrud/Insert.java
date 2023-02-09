package com.kgisl.hibercrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Insert {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
    Session session = factory.openSession();  
    Transaction t = session.beginTransaction();  
    Student s = new Student();
    s.setName("Manikandan");
    s.setDesignation("Selinium Tester");
    s.setSalary(15586.90f);
    s.setEmail("mani@gmail.com");
    session.save(s);
    
    t.commit();
    factory.close();
    session.close();
    }
    
}
