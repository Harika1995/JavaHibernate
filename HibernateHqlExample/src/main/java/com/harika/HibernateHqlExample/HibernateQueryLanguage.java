package com.harika.HibernateHqlExample;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harika.Pojo.Employee;

public class HibernateQueryLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory= cfg.buildSessionFactory();
        Session ses = factory.openSession();
        Transaction tx=ses.beginTransaction();
        //Named Paraeters
        System.out.println("Emloyee details with the employee no as 103");
        Query query = ses.createQuery("select eno,firstName,lastName,email from Employee where eno=:number");
        query.setParameter("number", 104);
        List<Object []> result =query.list();
        Object[] obj = result.get(0);
        System.out.println(obj[0]+"\t"+obj[1]+"\t"+obj[2]+"\t"+obj[3]);
        System.out.println("-----------------------");
        System.out.println("Dynamic query");
        Query query1 = ses.getNamedQuery("my_query");
        query1.setParameter("mail", "%gmail.com");
        List<Employee> dynamic_result = query1.list();
        for(Employee emp : dynamic_result) {
        	System.out.println(emp.getEno()+"\t"+emp.getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail());
        }
        System.out.println("Emloyee details with the employee no lessthan or equal to 103");
        Query query2 = ses.getNamedQuery("my_query1");
        query2.setParameter("num", 102);
        List<Employee> dynamic_result1 = query2.list();
        for(Employee emp1 : dynamic_result1) {
        	System.out.println(emp1.getEno()+"\t"+emp1.getFirstName()+"\t"+emp1.getLastName()+"\t"+emp1.getEmail());
        }
	}

}
