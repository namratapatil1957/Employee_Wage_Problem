package com.bridzelabz.empwage;

public class Emp_wage_case {

	public static void main(String[] args) {
		
		int wageperhrs=20;
		int workinghrs=0;
		
		int isPresent=(int)(Math.floor(Math.random()*10)%3);
		
		switch (isPresent){
		case 1:
				System.out.println("Employee work for full time");
				workinghrs=8;
				break;
		
		case 2: 
				System.out.println("Employee work for part time");
				workinghrs=4;
				break;
		
		default:
				System.out.println("Employee is absent");
				workinghrs=0;
				break;
				
		}
		int Dailywage=(wageperhrs * workinghrs);
		System.out.println("Employee daily wage is: " + Dailywage);
	}
}
