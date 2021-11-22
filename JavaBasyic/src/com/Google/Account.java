package com.Google;

public class Account {
	private String id;
	private double balance;
	
	String getId() {
		return id;
	}
	double getBalance() {
		return balance;
	}
	
	Account(String id){
		this.id = id;
		this.balance = 0.0;
	}
	Account(String id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	void save(double money) {
		this.balance += money;
	}
	
	void withdraw(double money) {
		if(this.balance < money) {
			return;
		}
		
		this.balance -= money;
	}
	
	
}
