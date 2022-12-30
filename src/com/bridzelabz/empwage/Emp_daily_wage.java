package com.bridzelabz.empwage;

public class Emp_daily_wage {
	public static void main(String[] args) {

		int wage_per_hrs=20;
		int fullworkinghrs=8;
		int Dailywage;
		
		int isPresent=(int)(Math.floor(Math.random()*10)%2);
		
		if(isPresent == 1) {
			System.out.println("Employee is present");
			Dailywage=(wage_per_hrs * fullworkinghrs);
			System.out.println("Employee daily wage is: " + Dailywage);
		}
		else {
			System.out.println("Employee is absent");
		}
	}
}
