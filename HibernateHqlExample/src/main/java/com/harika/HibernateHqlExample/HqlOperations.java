package com.harika.HibernateHqlExample;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harika.Pojo.Employee;

public class HqlOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg = new Configuration();
		 cfg.configure();
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session ses = factory.openSession();
		 Transaction tx = ses.beginTransaction();
		 Query q = ses.createQuery("from Employee");
		 q.setFirstResult(3);
		 q.setMaxResults(5);
		 List <Employee>list = q.list();
		 for(Employee emp:list) {
			 System.out.println(emp.getEno()+"\t"+emp.getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail());
		 }
	}

}
