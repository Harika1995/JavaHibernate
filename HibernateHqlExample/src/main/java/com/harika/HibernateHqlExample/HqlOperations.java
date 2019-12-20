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
		 System.out.println("------------- This is a Pagination Operation ----------------");
		 Query q = ses.createQuery("from Employee");
		 q.setFirstResult(3);
		 q.setMaxResults(5);
		 List <Employee>list = q.list();
		 for(Employee emp:list) {
			 System.out.println(emp.getEno()+"\t"+emp.getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail());
		 }
		 System.out.println("------------- This is an Update Operation ----------------");
		 Query q2 = ses.createQuery("update Employee set firstName=:name where eno=:number");
		 q2.setParameter("name", "Harika Chowdary");
		 q2.setParameter("number",100);
		 int count = q2.executeUpdate();
		 if(count!=0) {
			 System.out.println("Employee FirstName is Updated.");
		 }
		 else
			 System.out.println("Employee FirstName is not Updated.");
		 tx.commit();
	}
}
