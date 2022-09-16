package com.am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	  public void update() throws NumberFormatException, IOException
	   {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   try  {
			System.out.println("enter id for update employee");
			   int id=Integer.parseInt(br.readLine());
			   System.out.println("enter employee name");
			   String newname=br.readLine();
			   System.out.println("enter employee Address");
			   String newAdd=br.readLine();
			   System.out.println("enter employee sallary");
			   int newSal=Integer.parseInt(br.readLine());
			   System.out.println("enter employee Age");
			   int newAge=Integer.parseInt(br.readLine());
			   System.out.println("enter employee Email");
			   String newEmail=br.readLine();
			   System.out.println("enter employee Designation");
			   String newDesignation=br.readLine();
			   System.out.println("enter employee Gender");
			   String newGender=br.readLine();
			   System.out.println("enter employee Working Days");
			   int newWdays=Integer.parseInt(br.readLine());
			   System.out.println("enter employee Account No.");
			   String newAccNo=br.readLine();
			   System.out.println("enter employee Mobile No.");
			   String newMobNo=br.readLine();
			   
			   System.out.println("enter employee PAN number.");
			   String newpan=br.readLine();
			   
			   System.out.println("enter employee new UAN number.");
			   String newuan=br.readLine();
			   
			   Configuration conf= new Configuration();
				conf.configure("hibernate.cfg.xml");
				SessionFactory factory=conf.buildSessionFactory();
				Session session=factory.openSession();
				Transaction tx=session .beginTransaction();
				Employee emp =(Employee)session.get(Employee.class, id);
				emp.setEmpName(newname);
				emp.setEmpSal(newSal);
				emp.setAddress(newAdd);
				emp.setAge(newAge);
				emp.setEmail(newEmail);
				emp.setDesignation(newDesignation);
				emp.setGender(newGender);
				emp.setWorkingdays(newWdays);
				emp.setAccountno(newAccNo);
				emp.setMobno(newMobNo);
				emp.setPan(newpan);
				emp.setUan(newuan);
				
				 
			    tx.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   Menu m=new Menu();
		       m.mainmenu();
		   
		   
	   }

}
