package com.harika.HibernateAnnotationExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

import com.harika.Pojo.Employee;

public class App 
{
    public static void main( String[] args )
    {
        StandardServiceRegistry ss = new StandardServiceRegistryBuilder().configure().build();
        Metadata meta = new MetadataSources(ss).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session ses = factory.openSession();
        Transaction tx = ses.beginTransaction();
        Employee emp = new Employee();
        emp.setEno(2);
        emp.setFirstName("Phanindra");
        emp.setLastName("Naidu");
        emp.setEmail("phanindranaidu@gmail.com");
        ses.save(emp);
        tx.commit();
        ses.close();
        factory.close();
    }
}
