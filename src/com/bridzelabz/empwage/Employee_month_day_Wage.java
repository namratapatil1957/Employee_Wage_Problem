package com.bridzelabz.empwage;

public class Employee_month_day_Wage {

	public static void main(String[] args) {
			
		int wageperhrs=20;
		int totalworkinghrs=0;
		int Monthly_wage=0;
		int day=1;
		int workinghrs=0;
		
		int isPresent=(int)(Math.floor(Math.random()*10)%3);
		
		while (day < 20 && totalworkinghrs < 100 ) {
		
			switch(isPresent)
			{
				case '1':
					workinghrs=8;
					break;
				case '2':
					workinghrs=4;
					break;
				default:
					workinghrs=0;
					System.out.println("Employee absent");
					break;
			}
			
			totalworkinghrs=(totalworkinghrs * workinghrs);
			
			if( totalworkinghrs > 100 ) {
				totalworkinghrs=(totalworkinghrs - workinghrs);
			}
			int wage=( wageperhrs * workinghrs );
			Monthly_wage=(Monthly_wage + wage);
			
			day++;
		}
		System.out.println("Monthly wage of employee is: " +Monthly_wage);
		System.out.println("Total working hrs of month is: " +totalworkinghrs);
	}
}
