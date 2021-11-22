package com.Google;

public class Manager extends Employee{
	private double bonus;
	
	Manager(String name, double monthlySalary, double bonus){
		super(name,monthlySalary);
		this.bonus = bonus;
	}
	
	void setBonus(double bonus) {
		this.bonus = bonus;
	}
	double getBonus() {
		return bonus;
	}
	
	@Override
	double getAnnualSalary(int months) {
		return getMonthlysalary()*months+bonus;
	}
}
