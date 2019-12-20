package com.harika.HibernateHqlExample;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harika.Pojo.Employee;

public class HibernateNamedParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();
		//Dynamic Named Parameters
		
        System.out.println("Dynamic Named Query");
        Query query1 = ses.getNamedQuery("my_query");
        query1.setParameter("mail", "%gmail.com");
        List<Employee> dynamic_result = query1.list();
        for(Employee emp : dynamic_result) {
        	System.out.println(emp.getEno()+"\t"+emp.getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail());
        }
        
        System.out.println("Emloyee details with the employee no less than or equal to 103");
        Query query2 = ses.getNamedQuery("my_query1");
        query2.setParameter("num", 103);
        List<Employee> dynamic_result1 = query2.list();
        for(Employee emp1 : dynamic_result1) {
        	System.out.println(emp1.getEno()+"\t"+emp1.getFirstName()+"\t"+emp1.getLastName()+"\t"+emp1.getEmail());
        }
	}

}
