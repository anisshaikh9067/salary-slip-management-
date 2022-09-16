package com.am;

import java.io.IOException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Delete {
	 public void delete() throws NumberFormatException, IOException
	   {
		   
		   Scanner sc =new Scanner(System.in);
		   System.out.println("enter id for delete employee");
		   int id=sc.nextInt();
		   Configuration conf= new Configuration();
			conf.configure("hibernate.cfg.xml");
			SessionFactory factory=conf.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session .beginTransaction();
		    Query <Employee> query3=session.createQuery("delete Employee where empId="+id);
		    int deleted = query3.executeUpdate();
		    System.out.println("Deleted: " + deleted + " Employee");
		    tx.commit();
		   
		      Menu m=new Menu();
		       m.mainmenu();
		   
		   
	   }
}
