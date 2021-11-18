package com.Google;
import java.util.ArrayList;

public class StudentScoreTable {
	ArrayList<StudentScore> list;
	
	StudentScoreTable(){
		this.list = new ArrayList<StudentScore>();
	}
	
	public void add(StudentScore score) {
		list.add(score);
	}
	
	public StudentScore findByStuID(String stuID) {
		for(int i=0; i<list.size();i++) {
			if(stuID.equals(list.get(i).getStuid())) {
				return list.get(i);
			}
		}
		
		return null;
	}
	
}
