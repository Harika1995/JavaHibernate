package com.harika.HibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harika.Pojo.Sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//STEP:1 PREPARE CONFIGURATION OBJECT.
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	
    	//Step:2 Build SessionFactory
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	//step:3 Obtain a Session
    	Session ses=factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	
    	//step:4 Perform Persistence Operations
    	Sample s = new Sample();
    	s.setSno(2);
    	s.setName("Harika");
    	s.setAddr("Maryville");
    	
    	ses.save(s);
    	tx.commit();
    	
    	System.out.println(ses.contains(s));
    	ses.close();
    	factory.close();
    	
    }
}
