package com.bridzelabz.empwage;

public class emp_Wage_using_Class {

	int wageperhrs = 20;
	int totalfulltimehrs = 0;
	int totalparttimehrs = 0;
	int totalabsenthrs;
	int dailywage;
	int monthly_wage = 0;
	int isPresent;
	int workinghrs = 0;
	int monthlyworkinghrs = 0;
	
	void check_Attendance() {

        isPresent = (int) (Math.floor(Math.random() * 10) % 3);
        switch (isPresent) {
        
        case 0:
            System.out.println("Employee is Absent");
            workinghrs = 0;
            totalabsenthrs = totalabsenthrs + workinghrs;
            break;
                
        case 1:
        	System.out.println("Employee is working full time ");
        	workinghrs = 8;
        	totalfulltimehrs = totalfulltimehrs + workinghrs;
            break;
            
        case 2:
        	System.out.println("Employee is working part time");
        	workinghrs = 4;
        	totalparttimehrs = totalparttimehrs + workinghrs;
            break;
        }
    }
	
	void daily_Wage() {
        if (isPresent == 1) {
            dailywage = wageperhrs * workinghrs;
            System.out.println("The daily wage of Employee is : " + dailywage);
            
        } else if (isPresent == 2) {
            dailywage = wageperhrs * workinghrs;
            System.out.println("The daily wage of Employee is : " + dailywage);
            
        } else {
            dailywage = 0;
            System.out.println("The daily wage of Employee is : " + dailywage);
            
        }

    }
	
	void monthly_Wage() {
		
		monthly_wage = (monthly_wage + dailywage);
		monthlyworkinghrs = (monthlyworkinghrs + workinghrs);
	}
	
	void calculation() {
		
		System.out.println("Total working hour while employee is Full time : " + totalfulltimehrs);
        System.out.println("Total working hour while employee is Part time : " + totalparttimehrs);
        System.out.println("Total working hour while employee is Absent : " + totalabsenthrs);
        System.out.println("The monthly wage is: " + monthly_wage);
        System.out.println(" The monthly working hours of employee is: " +monthlyworkinghrs);
		
	}
	
	
	public static void main(String[] args) {
		
		emp_Wage_using_Class emp = new emp_Wage_using_Class();
		
		int totalworkinghrs = 0;
		int day;
		
		for (day = 1; day <= 20 && totalworkinghrs < 100; day++) {
			System.out.println( "For day " +day);
			emp.check_Attendance();
			emp.daily_Wage();
			emp.monthly_Wage();
			System.out.println();
			
		}
		emp.calculation();
	}
}
