package com.harika.HibernateTablePerSubClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harika.Pojo.AnnEditionBook;
import com.harika.Pojo.Book;
import com.harika.Pojo.SpecialEditionBook;



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
    	Book book = new Book();
    	book.setId(1);
    	book.setName("Java");
    	book.setType("Programming");
    	book.setPrice(23.45);
    	ses.save(book);
    	
		AnnEditionBook book1=new AnnEditionBook();
		book1.setId(2);
		book1.setName("User Experience Design");
		book1.setType("Theory");
		book1.setPrice(45.34);
		book1.setDiscount(20);
		ses.save(book1);
		
		SpecialEditionBook book2=new SpecialEditionBook();
		book2.setId(3);
		book2.setName("C Programming");
		book2.setType("Programming");
		book2.setPrice(12.45);
		book2.setCds(1);
		ses.save(book2);
		tx.commit();
		System.out.println(ses.contains(book));
		System.out.println(ses.contains(book1));
		System.out.println(ses.contains(book2));
		ses.close();
		factory.close();
    }
}
