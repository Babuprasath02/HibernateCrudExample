package com.kgisl.hibercrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Update {
    public static void main(String[] args) {
        SessionFactory sessionFactory=SessionFactoryProvider.provideSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();

        Student s = session.get(Student.class, 4);
        s.setName("Neerkaathalingam");
        session.save(s);
        t.commit();
        sessionFactory.close();
    }
    
}
