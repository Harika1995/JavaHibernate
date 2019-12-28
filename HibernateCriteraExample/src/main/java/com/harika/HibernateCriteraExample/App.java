package com.harika.HibernateCriteraExample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
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
    	System.out.println("1. Working with the equal meathod in the HCQL");
    	Criteria c3 = ses.createCriteria(Employee.class);
    	c3.add(Restrictions.and(Restrictions.like("lastName","Naidu"),Restrictions.eq("eno",102)));
    	List <Employee>list3 = c3.list();
    	for(Employee emp3 : list3) {
    		System.out.println(emp3.getEno()+"\t"+emp3.getFirstName()+"\t"+emp3.getLastName()+"\t"+emp3.getEmail());
    	}
    	System.out.println("2. Working with the lessthan and equal meathod in the HCQL");
    	Criteria c4 = ses.createCriteria(Employee.class);
    	c4.add(Restrictions.and(Restrictions.like("lastName","Naidu"),Restrictions.le("eno",103)));
    	List <Employee>list4 = c4.list();
    	for(Employee emp4 : list4) {
    		System.out.println(emp4.getEno()+"\t"+emp4.getFirstName()+"\t"+emp4.getLastName()+"\t"+emp4.getEmail());
    	}
    	System.out.println("3. Working with the greaterthan and equal meathod in the HCQL");
    	Criteria c5 = ses.createCriteria(Employee.class);
    	c5.add(Restrictions.and(Restrictions.like("lastName","Naidu"),Restrictions.ge("eno",103)));
    	List <Employee>list5 = c5.list();
    	if(list5 == null) {
	    	for(Employee emp5 : list5) {
	    		System.out.println(emp5.getEno()+"\t"+emp5.getFirstName()+"\t"+emp5.getLastName()+"\t"+emp5.getEmail());
	    	}
    	}
    	else
    		System.out.println("There is no data in the list from the query");
    	System.out.println("4. Working with the lessthan meathod in the HCQL");
    	Criteria c6 = ses.createCriteria(Employee.class);
    	c6.add(Restrictions.and(Restrictions.like("lastName","Naidu"),Restrictions.lt("eno",103)));
    	List <Employee>list6 = c6.list();
    	for(Employee emp6 : list6) {
    		System.out.println(emp6.getEno()+"\t"+emp6.getFirstName()+"\t"+emp6.getLastName()+"\t"+emp6.getEmail());
    	}
    	System.out.println("5. Working with the greater than meathod in the HCQL");
    	Criteria c7 = ses.createCriteria(Employee.class);
    	c7.add(Restrictions.and(Restrictions.like("lastName","Naidu"),Restrictions.gt("eno",103)));
    	List <Employee>list7 = c7.list();
    	if(list7==null) {
	    	for(Employee emp7 : list7) {
	    		System.out.println(emp7.getEno()+"\t"+emp7.getFirstName()+"\t"+emp7.getLastName()+"\t"+emp7.getEmail());
	    	}
    	}
    	else 
    		System.out.println("There is no data in the list from the query");
    	System.out.println("Working with the Projections");
    	Criteria cri =  ses.createCriteria(Employee.class);
    	cri.setProjection(Projections.projectionList().
    			add(Projections.property("firstName")).add(Projections.property("lastName")));
    	List <Object []> ll = cri.list();
    	for(Object[] res:ll) {
    		System.out.println(res[0]+"\t"+res[1]);
    	}
    	Criteria cc = ses.createCriteria(Employee.class);
    	cc.setProjection(Projections.property("firstName"));
    	 List l = cc.list();
		 Object row = (Object)l.get(0);
		 System.out.println(row.toString());
    }
}
