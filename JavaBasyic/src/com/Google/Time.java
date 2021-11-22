package com.Google;

public class Time {
	private int hour,minute,second;
	
	Time(long time){
		this.hour = (int)((time/3600000%24+8)%24);
		this.minute = (int)(time%3600000/60000);
		this.second = (int)(time%3600000%60000/1000);
	}
	
	void setTime (long elapsedTime){
		this.hour = (int)((elapsedTime/3600000%24+8)%24);
		this.minute = (int)(elapsedTime%3600000/60000);
		this.second = (int)(elapsedTime%3600000%60000/1000);
	}
	
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute  = minute;
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
	
	
}
