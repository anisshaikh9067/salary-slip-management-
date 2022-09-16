package com.am;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Display {
	public void display() throws NumberFormatException, IOException
	   {
		   Configuration conf= new Configuration();
			conf.configure("hibernate.cfg.xml");
			SessionFactory factory=conf.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session .beginTransaction();
			Query<Employee> query = session.createQuery("from Employee");
	        java.util.List<Employee> list = query.list();
	        System.out.println("EmpId \t\t\t\t Name \t\t\t Gender \t\t age \t\t E-mail \t \t\t\t\t mobile number\t \taddress \t\t\t  Designation \t\t working days \t\t account number \t\t UAN number \t\t PAN number \t\t PF \t\t Salary \t DA Allowense \t house rent Allowense \t Gross Sallary \t Net Sallary \t Tax");
	        list.stream().forEach(e->System.out.println(e.getEmpId()+"\t"+"\t"+"\t"+"\t "+e.getEmpName()+"\t "+"\t"+e.getGender()+"\t"+"\t"+"\t "+e.getAge()+"\t "+"\t"+e.getEmail()+"\t"+"\t"+"\t "+e.getMobno()+"\t "+"\t"+e.getAddress()+"\t "+"\t"+"\t  1"+e.getDesignation()+"\t "+"\t"+e.getWorkingdays()+"\t"+
	        "\t "+"\t"+e.getAccountno()+"\t"+"\t "+"\t"+e.getUan()+"\t "+"\t"+e.getPan()+"\t"+"\t"+e.getPf()+"\t"+"\t"+e.getEmpSal()+"\t"+e.getDa()+"\t"+e.getHra()+"\t"+e.getGs()+"\t"+e.getNs()+"\t"+e.getTax()));
	  
	     
	        tx.commit();
	        session.close();
	       Menu m=new Menu();
	       m.mainmenu();
	   }    
}
