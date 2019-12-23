package com.harika.HibernateCriteraExample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.harika.Pojo.Employee;

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
    	System.out.println("Working with Hibernate Criterai Query Language");
    	Criteria c = ses.createCriteria(Employee.class);//This statement will work as the select * from employee
    	List <Employee>list = c.list();
    	for(Employee emp : list) {
    		System.out.println(emp.getEno()+"\t"+emp.getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail());
    	}
    	System.out.println("Working with the Pagination in HCQL");
    	Criteria c1 = ses.createCriteria(Employee.class);
    	c1.setFirstResult(3);
    	c1.setMaxResults(6);
    	List <Employee>list1 = c1.list();
    	for(Employee emp1 : list1) {
    		System.out.println(emp1.getEno()+"\t"+emp1.getFirstName()+"\t"+emp1.getLastName()+"\t"+emp1.getEmail());
    	}
    	System.out.println("Working with the Ordering in HCQL");
    	Criteria c2 = ses.createCriteria(Employee.class);
    	c2.addOrder(Order.desc("eno"));
    	List <Employee>list2 = c2.list();
    	for(Employee emp2 : list2) {
    		System.out.println(emp2.getEno()+"\t"+emp2.getFirstName()+"\t"+emp2.getLastName()+"\t"+emp2.getEmail());
    	}
    	System.out.println("Working with the where conditions HCQL");
    	Criteria c3 = ses.createCriteria(Employee.class);
    	c3.add(Restrictions.and(Restrictions.like("lastName","Naidu"),Restrictions.le("eno",103)));
    	List <Employee>list3 = c3.list();
    	for(Employee emp3 : list3) {
    		System.out.println(emp3.getEno()+"\t"+emp3.getFirstName()+"\t"+emp3.getLastName()+"\t"+emp3.getEmail());
    	}
    	
    }
}
