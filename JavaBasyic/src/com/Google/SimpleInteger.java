package com.Google;

public class SimpleInteger {
	private int value;
	
	int getValue() {
		return value;
	}
	
	SimpleInteger(int input){
		this.value = input;
	}
	
	boolean isPrime() {
		if(value <= 0) {
			return false;
		}
		
		for(int i=2; i<value; i++) {
			if(value%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	boolean isEven() {
		if(value%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean isOdd() {
		if(value%2 == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	boolean equals(SimpleInteger o) {
		if(value == o.value) {
			return true;
		}else {
			return false;
		}
	}
}
