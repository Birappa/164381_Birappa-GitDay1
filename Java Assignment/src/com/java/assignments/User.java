package com.java.assignments;

import java.util.Scanner;

public class User {

	private String username="Birappa";
	private int password=123456;
	Scanner sc =new Scanner(System.in);
	
	public void validateUser() {
		int attempt=0;
		String uname;
		int pass;
		System.out.println("Enter Username and Password to Login");
		while(attempt<3) {
			uname=sc.next();
			pass=sc.nextInt();
			int result=uname.compareTo(username);
			if(result==0 && pass==password){
				System.out.println("Welcome to ITHUB");
				break;
			}	
			else {
				System.out.println("Invalid Username or Password");
				attempt++;
			}
				
		}
		
	}
}
