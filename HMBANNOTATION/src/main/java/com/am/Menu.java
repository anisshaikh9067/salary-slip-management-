package com.am;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {
    int ch;

    Scanner sc=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void mainmenu() throws NumberFormatException, IOException {
	System.out.println("enter your choice");
	System.out.println("................................................");
	System.out.println("1 for insert Employee Record ");
	System.out.println("2 for update Employee Record ");
	System.out.println("3 for delete Employee Record ");
	System.out.println("4 for display Employee Record ");
	System.out.println("5 for add new Admin ");
	System.out.println("6 for Update username and password for Admin");
	System.out.println("7 log out System");
	Lin cp;
	ch=sc.nextInt();
	switch(ch) {
	
    case 1:  Insert ins=new Insert ();
	         ins.insertRecord();
	         break;
	        
		
    case 2:  Update updt=new Update ();
             updt.update();
             break;
             
             
	case 3:  Delete del=new Delete ();
             del.delete();
	         
	         
	case 4: Display disp=new Display ();
		    disp.display();  
		    
		    
	case 5: cp=new Lin();
	          cp.changepass();
	          
	case 6:  Updatepassword up=new Updatepassword();
	          up.updatepassword();
	          
	          
	case 7:   Login li=new Login();
	          li.set();
	
	          
	          
     default : System.out.println(".....you entered wrong case");
               
                
                 
    	  
	}
	
	
	
	
	}
	
}
