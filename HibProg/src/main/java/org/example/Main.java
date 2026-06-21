package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        cleaners c1 = new cleaners();
        c1.setId(1);
        c1.setName("Nimisha");
        c1.setAge(23);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.cleaners.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.merge(c1);

        transaction.commit();
        System.out.println(c1);
        session.close();
    }
}