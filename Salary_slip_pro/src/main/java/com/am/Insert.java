package com.am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	public void insertRecord() throws NumberFormatException, IOException
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
        System.out.println("Enter monthly Sallary");
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
        
        System.out.println("Enter employee monthly Working days");
        int workingdays=Integer.parseInt(br.readLine());
        
        System.out.println("Enter employee Account number");
        String accountno=br.readLine();
        
        System.out.println("Enter employee mobile no");
        String  mobno=br.readLine();   
        
        System.out.println("Enter employee PAN number");
        String  pan=br.readLine();   
        
        System.out.println("Enter employee UAN number");
        String  uan=br.readLine(); 
        double tax=0;
        if(Sallary>=40000 || Sallary<=60000)
        {
        	tax=(Sallary/100)*10;
        }
        else if (Sallary>60000 || Sallary<=80000)
        {
        	tax=(Sallary/100)*15;
        }
        else if (Sallary>80000 || Sallary<=100000)
        {
        	tax=(Sallary/100)*20;
        }
        else if (Sallary>100000 || Sallary<=125000)
        {
        	tax=(Sallary/100)*25;
        }
        else if (Sallary>125000)
        {
        	tax=(Sallary/100)*30;
        }
        
        double pf=(Sallary/100)*12;        //pf
        double da=(Sallary/100)*5;      //medical allowence
        double hra=(Sallary/100)*10;        //house rent
        double gs=Sallary+pf+da+hra;        //gross sallary
        double nt=gs-pf-da-hra-tax;             //net sallary
        
        
		
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
		emp.setUan(uan);
		emp.setPan(pan);
		emp.setPf(pf);
		emp.setDa(da);
		emp.setHra(hra);
		emp.setGs(gs);
		emp.setNs(nt);
		emp.setTax(tax);
		
		Transaction tx=session.beginTransaction();
		session.persist(emp);
		tx.commit();
		System.out.println("Record Inserted"+emp);
		session.close();
		 Menu m=new Menu();
	       m.mainmenu();
		
	}
}
