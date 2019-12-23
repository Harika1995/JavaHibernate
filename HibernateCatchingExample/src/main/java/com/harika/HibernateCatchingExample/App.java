package com.harika.HibernateCatchingExample;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harika.Pojo.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session ses = factory.openSession();
        Transaction tx = ses.beginTransaction();
        Employee emp1 = (Employee)ses.load("Employee.class", 100);
        System.out.println(emp1.getId()+"\t"+emp1.getName()+"\t"+emp1.getSalary());
        ses.close();
        Session ses1 = factory.openSession();
        Transaction tx1 = ses.beginTransaction();
        Employee emp2 = (Employee)ses.load("Employee.class", 100);
        System.out.println(emp2.getId()+"\t"+emp2.getName()+"\t"+emp2.getSalary());
        ses1.close();
    }
}
