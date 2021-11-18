package com.Google;

public class Time {
	private int hour,minute,second;
	
	Time(){
		
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	Time(int hour, int minute, int second){

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	int getHour() {

		return hour;
	}
	
	int getMinute() {
		return minute;
	}
	
	int getSecond() {

		return second;
	}
	
	void setTime(long elapsedTime) {
		this.hour = (int)((elapsedTime/3600000)%24 + 8);
		elapsedTime = elapsedTime%3600000;
		this.minute = (int)elapsedTime/60000;
		elapsedTime = elapsedTime%60000;
		this.second = (int)elapsedTime/1000;
	}
	
}
