package com.Google;

public class Thermometer {
	private char unit;
	private double temperature;
	
	Thermometer(){
		this.temperature = 0;
		this.unit = 'C';
	}
	
	Thermometer(double temperature, char unit){
		this.temperature = temperature;
		this.unit = unit;
	}
	
	char getUnit() {
		return unit;
	}
	
	double getTemperature() {
		return temperature;
	}
	
	void switchUnit() {
		if(unit == 'C') {
			this.unit = 'F';
			this.temperature = (temperature*9.0/5) + 32;
		}else {
			this.unit = 'C';
			this.temperature = (temperature - 32)*5/9;
		}
	}
}
