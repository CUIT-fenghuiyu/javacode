package com.Google;

public class Employee {
	private String name;
	private double monthlySalary;
	
	Employee(String name, double monthlySalary){
		this.name = name;
		this.monthlySalary = monthlySalary;
	}
	
	String getName() {
		return name;
	}
	void setMonthlysalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	double getMonthlysalary() {
		return monthlySalary;
	}
	
	double getAnnualSalary(int months) {
		return monthlySalary * months;
	}
}
