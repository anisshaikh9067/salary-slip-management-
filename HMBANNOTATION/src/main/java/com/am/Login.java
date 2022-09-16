package com.am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Login {
    String username;
    String password;
    String un;
    String pw;
	//Scanner sc=new Scanner (System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	 public void set() throws NumberFormatException, IOException
	   {
		   Configuration conf= new Configuration();
			conf.configure("hibernate.cfg.xml");
			SessionFactory factory=conf.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session .beginTransaction();
			Lin l =new Lin();
			System.out.println("Enter Admin Id");
			int id=Integer.parseInt(br.readLine());
			l=(Lin)session.get(Lin.class, id);
			
	        
	       this.username=l.getUsername();
	       this.password=l.getPassword();
	    
//	        tx.commit();
//	        session.close();
	       
	
		System.out.println("enter Admin username");
		un=br.readLine();
		System.out.println("enter Admin password");
		pw=br.readLine();
		
		
		if(un.equals(username) && pw.equals(password))
		{
			
			Menu m=new Menu();
			m.mainmenu();
			
		}
		else
		{
			System.out.println("you entered wrong username and password");
		    set();
		}
		
		
	}
	
}
