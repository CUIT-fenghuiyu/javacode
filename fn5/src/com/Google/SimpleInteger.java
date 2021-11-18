package com.Google;

public class SimpleInteger {
	private int value;
	
	SimpleInteger(int value){
		this.value = value;
	}
	
	int getValue() {
		return value;
	}
	
	boolean isPrime() {
		if(value <= 0) {
			return false;
		}
		
		for(int i=2; i<value; i++) {
			if(value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	boolean isEven() {
		if(value%2 == 0) {
			return true;
		}
		return false;
	}
	
	boolean isOdd() {
		if(value%2 == 1) {
			return true;
		}
		return false;
	}
	
	boolean equals(SimpleInteger o) {
		if(o.equals(value)) {
			return true;
		}
		return false;
	}
	
}

