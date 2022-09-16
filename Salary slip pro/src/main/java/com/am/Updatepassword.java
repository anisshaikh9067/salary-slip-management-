package com.am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Updatepassword {
	
	
	public void updatepassword() throws NumberFormatException, IOException
	   {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   try  {
			System.out.println("enter id for update employee");
			   int id=Integer.parseInt(br.readLine());
			   
			   System.out.println("enter username for update");
			   String username=br.readLine();
			   
			   System.out.println("enter id for update employee");
			   String password=br.readLine();
			   
			   Configuration conf= new Configuration();
				conf.configure("hibernate.cfg.xml");
				SessionFactory factory=conf.buildSessionFactory();
				Session session=factory.openSession();
				Transaction tx=session .beginTransaction();
				Lin l=(Lin)session.get(Lin.class, id);
				
				l.setUsername(username);
				l.setPassword(password);
				
				 
			    tx.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   Login li=new Login();
			li.set();
		   
	   }

}
