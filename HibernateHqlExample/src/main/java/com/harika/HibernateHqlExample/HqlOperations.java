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
		 tx.commit();//we need to commit the transaction if we did not perform the select query.
		 System.out.println("------------- This is a Aggregate Functions ----------------");
		 System.out.println("Count of Employees");
		 Query q3 = ses.createQuery("select count(*) from Employee");
		 List l = q3.list();
		 Object row = (Object)l.get(0);
		 System.out.println("Count of Employees: "+row.toString());
		 System.out.println("Maximum and Minimum Employee Number");
		 Query max_min = ses.createQuery("Select max(eno),min(eno) from Employee");
		 List li = max_min.list();
		 Object r[] = (Object[])li.get(0);
		 System.out.println("Maximum Employee Number: "+r[0].toString());
		 System.out.println("Minimum Employee Number: "+r[1].toString());
	}
}
