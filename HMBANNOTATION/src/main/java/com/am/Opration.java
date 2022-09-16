package com.am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Opration {
	
	private static final Object Employee = null;
/*	public void insertRecord() throws NumberFormatException, IOException
	{
		Configuration conf= new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Employee emp=new Employee();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter EMP Id..");
        int id=Integer.parseInt(br.readLine());
        System.out.println("Enter Employee name");
        String name=br.readLine();
        System.out.println("Enter Sallary");
        double Sallary=Double.parseDouble(br.readLine());
        
        System.out.println("Enter employee Address");
        String address=br.readLine();
        
        System.out.println("Enter employee E-Mail");
        String email=br.readLine();
        
        System.out.println("Enter employee Designation");
        String designation=br.readLine();
        
        System.out.println("Enter employee Age");
        int age=Integer.parseInt(br.readLine());
        
        
        System.out.println("Enter employee gender");
        String gender=br.readLine();
        
        System.out.println("Enter employee Working days");
        int workingdays=Integer.parseInt(br.readLine());
        
        System.out.println("Enter employee Account number");
        String accountno=br.readLine();
        
        System.out.println("Enter employee mobile no");
        String  mobno=br.readLine();        
        
       
        
        
        
        
		
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSal(Sallary);
		emp.setAccountno(accountno);
		emp.setAddress(address);
		emp.setAge(age);
		emp.setDesignation(designation);
		emp.setEmail(email);
		emp.setWorkingdays(workingdays);
		emp.setGender(gender);
		emp.setMobno(mobno);
		
		
		Transaction tx=session.beginTransaction();
		session.persist(emp);
		tx.commit();
		System.out.println("Record Inserted"+emp);
		session.close();
		 Menu m=new Menu();
	       m.mainmenu();
		
	}
	*/
	 /*  public void display() throws NumberFormatException, IOException
	   {
		   Configuration conf= new Configuration();
			conf.configure("hibernate.cfg.xml");
			SessionFactory factory=conf.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session .beginTransaction();
			Query<Employee> query = session.createQuery("from Employee");
	        java.util.List<Employee> list = query.list();
	        System.out.println("EmpId \t\t Name \t Gender \t age \t E-mail \t \t mobile number\t address \t\t  Designation \t working days \t account number   ");
	list.stream().forEach(e->System.out.println(e.getEmpId()+"\t"+"\t "+e.getEmpName()+"\t "+e.getGender()+"\t"+"\t "+e.getAge()+"\t "+e.getEmail()+"\t"+"\t"+e.getMobno()+"\t "+e.getAddress()+"\t "+"\t "+e.getDesignation()+"\t "+e.getWorkingdays()+"\t"+"\t "+e.getAccountno()));
	  
	     // System.out.print(list.g);
	        tx.commit();
	        session.close();
	       Menu m=new Menu();
	       m.mainmenu();
	   }   
	   */  
/*	   public void delete() throws NumberFormatException, IOException
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
		    System.out.println("Deleted: " + deleted + " Employee(s)");
		    tx.commit();
		    Menu m=new Menu();
		       m.mainmenu();
		   
		   
	   }
	   */
	/*  
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
				
				 
			    tx.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   Menu m=new Menu();
		       m.mainmenu();
		   
		   
	   }
	*/

}
