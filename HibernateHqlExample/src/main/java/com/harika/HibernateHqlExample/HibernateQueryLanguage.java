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
        //Named Parameters
        System.out.println("Emloyee details with the employee no as 103");
        Query query = ses.createQuery("select eno,firstName,lastName,email from Employee where eno=:number");
        query.setParameter("number", 104);
        List<Object []> result =query.list();
        Object[] obj = result.get(0);
        System.out.println(obj[0]+"\t"+obj[1]+"\t"+obj[2]+"\t"+obj[3]);
        
	}

}
