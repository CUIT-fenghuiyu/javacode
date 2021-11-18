package com.Google;

public class StudentScore {
	private String stuID;
	private double score;
	
	StudentScore(String stuID,double score){
		this.stuID = stuID;
		this.score = score;
	}
	
	void setStuid(String stuID) {
		this.stuID = stuID;
	}
	
	String getStuid() {
		return stuID;
	}
	
	void setScore(double score) {
		this.score = score;
	}
	
	double getScore() {
		return score;
	}
}
