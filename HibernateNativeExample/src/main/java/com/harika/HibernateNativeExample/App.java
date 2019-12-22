package com.harika.HibernateNativeExample;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.harika.Pojo.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session ses = factory.openSession();
        Transaction tx = ses.beginTransaction();
        //Here we are using SQLQuery which is an interface for the Native SQL 
        SQLQuery query = ses.createSQLQuery("select * from employee");
        /*From the above SQLQuery we are returning more than one record which is known as the entity query.
         * These Entity queries must be registered with the pojo class using the addEntity().
         */
        query.addEntity("e", Employee.class);
        List<Employee> list = query.list();
        for(Employee emp : list) {
        	System.out.println(emp.getEno()+"\t"+emp.getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail());
        }
        
        System.out.println("----- Scaller Query -----");
        SQLQuery query1 = ses.createSQLQuery("select firstname,lastname from employee");
        /*From the above SQLQuery we are returning the data with the specific columns having which is known as the scaler query.
         * Here we need to add the scaler query with the Pojo class Data types using the addScaler().
         */
        query1.addScalar("firstname");
        query1.addScalar("lastname");
        List<Object []>list1 = query1.list();
        for(Object obj[]  :list1) {
        	System.out.println(obj[0]+"\t"+obj[1]);
        }
        SQLQuery query2 = ses.createSQLQuery("insert into employee values(?,?,?,?)");
        query2.setInteger(0, 105);
        query2.setString(1,"Samantha");
        query2.setString(2,"Akkineni");
        query2.setString(3,"samathaakkineni@gmail.com");
        int result = query2.executeUpdate();
        tx.commit();
        if(result!=0) {
        	System.out.println("Recorded added into the table");
        }
        else
        	System.out.println("Recorded is not added into the table");
    }
}
