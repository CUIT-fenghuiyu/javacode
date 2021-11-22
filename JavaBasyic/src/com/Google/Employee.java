package com.Google;

public class Employee extends Person{
	private int salary;
	
	void setSalary(int salary) {
		this.salary = salary;
	}
	int getSalary() {
		return salary;
	}
	
	Employee(String name, int age, int salary){
		super(name,age);
		if(salary<0) {
			this.salary = 0;
		}else {
			this.salary = salary;
		}
	}
	
	@Override
	int getAnnualIncome(int months){
		return salary*months; 
	}
}
