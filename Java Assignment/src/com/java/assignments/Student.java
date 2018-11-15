package com.java.assignments;

import java.awt.Toolkit;
import java.util.Scanner;

public class Student {

	private int student[][];
	private String names[]= {"Birappa","Pradeep","Roshan"};
	int totalAvg[][]=new int[3][2];
	int subTotAvg[][]=new int[3][2];
	Scanner sc=new Scanner(System.in);
	
	public void getStudentMarks() {
		student=new int[3][3];
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter "+names[i]+"'s three subject marks");
			for(int j=0;j<3;j++) {
				student[i][j]=sc.nextInt();
			}
		}
		
	}
	
	public void calculation() {
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				totalAvg[i][0]+=student[i][j];
				subTotAvg[i][0]+=student[j][i];
			}
			totalAvg[i][1]=totalAvg[i][0]/3;
			subTotAvg[i][1]=subTotAvg[i][0]/3;
		}
	}
	
	public void display() {
		System.out.println("Student\t\tSubject");
		System.out.println("Score  Average\tScore  Average");
		for(int i=0;i<3;i++) {
			System.out.println(totalAvg[i][0]+"\t"+totalAvg[i][1]+"\t  "+subTotAvg[i][0]+"\t"+subTotAvg[i][1]);
		}
	}
}
