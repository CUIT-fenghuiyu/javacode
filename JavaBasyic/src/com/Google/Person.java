package com.Google;

abstract class Person {
	abstract int getAnnualIncome(int months);
	private int age;
	private String name;
	
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
