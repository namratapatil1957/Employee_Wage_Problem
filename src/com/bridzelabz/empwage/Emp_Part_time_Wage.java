package com.bridzelabz.empwage;

public class Emp_Part_time_Wage {

	public static void main(String[] args) {
		
		int wageperhrs=20;
		int workinghrs=0;
		
		int isPresent=(int)(Math.floor(Math.random()*10)%3);
		
		if(isPresent == 1) {
			System.out.println("Employee work for full time");
			workinghrs=8;
		}
		else if(isPresent==2) {
			System.out.println("Employee work for part time");
			workinghrs=4;
		}
		else {
			System.out.println("Employee is absent");
			workinghrs=0;
		}
		int Dailywage=(wageperhrs * workinghrs);
		System.out.println("Employee daily wage is: " + Dailywage);
	}
}
