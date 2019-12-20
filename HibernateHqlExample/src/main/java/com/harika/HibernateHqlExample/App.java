package com.harika.HibernateHqlExample;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harika.Pojo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory= cfg.buildSessionFactory();
        Session ses = factory.openSession();
        Transaction tx=ses.beginTransaction();
        /*Query is an interface in the hibernate while working with the hql
         * We are having the createQuery(String query) and getSelectivequery(String query) methods
         * to crate a quegy and to get the query in the hibernate environment
        */
        System.out.println("***List of all Employees form Employees table***");
        Query query_all = ses.createQuery("from Employee");
        List<Employee> list_all = query_all.list();
        for(Employee emp_all: list_all) {
        	System.out.println(emp_all.getEno()+"\t"+emp_all.getFirstName()+"\t"+emp_all.getLastName()+"\t"+emp_all.getEmail());
        }
        System.out.println("***List of all Employees form Employees table with FirstName and LastName***");
        Query query_columns_all = ses.createQuery("select firstName,lastName from Employee");
        List <Object []>obj =query_columns_all.list();
        for(Object[] o : obj)
        {
        	System.out.println(o[0]+"\t"+o[1]);
        }
        System.out.println("***Constructor based Expressions***");
        Query query_constructor = ses.createQuery("select new Employee(eno,firstName,lastName,email) from Employee");
        List <Employee>result =query_constructor.list();
        for(Employee emp_const:result) {
        	System.out.println(emp_const.getEno()+"\t"+emp_const.getFirstName()+"\t"+emp_const.getLastName()+"\t"+emp_const.getEmail());
        }
        Query query_constructor1 = ses.createQuery("select new Employee(firstName,lastName) from Employee");
        List<Employee>result1 = query_constructor1.list();
        for(Employee emp_const1:result1) {
        	System.out.println(emp_const1.getFirstName()+"\t"+emp_const1.getLastName());
        }
    }
}
