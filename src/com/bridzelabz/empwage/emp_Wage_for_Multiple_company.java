package com.bridzelabz.empwage;

public class emp_Wage_for_Multiple_company {

	int wageperhrs;
	int totalfulltimehrs;
	int totalparttimehrs;
	int totalabsenthrs;
	int dailywage;
	int monthly_wage;
	int totalworkinghrs;
	int day;
	int isPresent;
	int workinghrs;
	int workingdays;
	int monthlyworkinghrs;
	int workingmonthlyhrs;
	String company_name;
	
	emp_Wage_for_Multiple_company (String company_name, int wageperhrs, int workingdays, int workingmonthlyhrs) {
		
		this.wageperhrs = wageperhrs;
		this.totalfulltimehrs = 0;
		this.totalparttimehrs = 0;
		this.totalabsenthrs = 0;
		this.dailywage = 0;
		this.monthly_wage = 0;
		this.totalworkinghrs = 0;
		this.day = 1;
		this.workinghrs = 0;
		this.workingdays = workingdays;
		this.monthlyworkinghrs = 0;
		this.workingmonthlyhrs = workingmonthlyhrs;
		this.company_name = company_name;
		
	}
	
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
            System.out.println("The daily wage of" + company_name + " employee is : " + dailywage);
            
        } else if (isPresent == 2) {
            dailywage = wageperhrs * workinghrs;
            System.out.println("The daily wage of" + company_name + " employee is : " + dailywage);
            
        } else {
            dailywage = 0;
            System.out.println("The daily wage of" + company_name + " employee is : " + dailywage);
            
        }

    }
	
	void monthly_Wage() {
		
		monthly_wage = (monthly_wage + dailywage);
		monthlyworkinghrs = (monthlyworkinghrs + workinghrs);
	}
	
	void calculation() {
		
		System.out.println("Total working hour while" + company_name + " employee is Full time : " + totalfulltimehrs);
        System.out.println("Total working hour while" + company_name + " employee is Part time : " + totalparttimehrs);
        System.out.println("Total working hour while" + company_name + " employee is Absent : " + totalabsenthrs);
       // System.out.println("The monthly wage of" + company_name + " employee is: " + monthly_wage);
       // System.out.println("The monthly working hours of" + company_name + " employee is: " + monthlyworkinghrs);
        System.out.println();
		
	}
	
	void company() {
	
		for (day = 1; day <= workingdays && totalworkinghrs < workingmonthlyhrs; day++) {
			System.out.println( "For day " +day);
			
			check_Attendance();
			daily_Wage();
			monthly_Wage();
			System.out.println();
			
		}
		calculation();
		
	}
	
	
	public static void main(String[] args) {
		
		emp_Wage_for_Multiple_company amazon = new emp_Wage_for_Multiple_company(" Amazon", 10, 20, 90);
		amazon.company();
		
		emp_Wage_for_Multiple_company flipkart = new emp_Wage_for_Multiple_company(" Flipkart", 10, 20, 90);
		flipkart.company();
	}
}
