package com.bridzelabz.empwage;

public class Emp_absent_present {
	public static void main(String[] args){
		
		int isPresent =(int)( Math.floor(Math.random()*10) %2 );
		
		if(isPresent == 1) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}
}
