package com.am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Lin {
	private static final Object Lin = null;
	@Id
	int id;
	String username;
	String password;
	public void changepass() throws NumberFormatException, IOException
	{
		Configuration conf= new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Lin l=new Lin();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  Id..");
        int id=Integer.parseInt(br.readLine());
        System.out.println("Enter new username ");
        String newusername=br.readLine();
        System.out.println("Enter new password ");
        String newpassword=br.readLine();
        l.setId(id);
        l.setUsername(newusername);
        l.setPassword(newpassword);
        Transaction tx=session.beginTransaction();
		session.persist(l);
		tx.commit();
		System.out.println("password changed successfully"+l);
		session.close();
		Login li=new Login();
		li.set();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
