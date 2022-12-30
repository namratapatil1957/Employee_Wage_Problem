package com.bridzelabz.empwage;

public class Emp_Wage_for_Month {

	public static void main(String[] args) {
		
		int wageperhrs=20;
		int workinghrs=0;
		int Monthly_wage=0;
		int day;
		
		
		
		for ( day=1; day<=20; day++){
			
			int isPresent = (int)Math.floor(Math.random()*10)%2;	
			
			switch (isPresent)
			{
				case 1:
					workinghrs=8;
					break;
					
				case 2:
					workinghrs=4;
					break;
					
				default:
					workinghrs=0;
					break;
			}
			
			int wage=(wageperhrs * workinghrs);
			Monthly_wage=(Monthly_wage * wage);
			//System.out.println("wage of employee is: " +wage);
		}
		System.out.println("Monthly wage of employee is: " +Monthly_wage);

	}	
}
