package com.Google;
import java.util.ArrayList;

class Stack {
	ArrayList<String> list = new ArrayList<String>();
	void push(String s) {
		
		String tmp = "";		
		
		for(int i=0; i<s.length();i++) {
			int j=0;
			while(i <s.length() && s.charAt(i) != ' ' && s.charAt(i) != '?') {
				tmp += s.charAt(i);
				i++;
				j=1;
			}
			
			if(j==1) {
				list.add(0,tmp);
				tmp = "";
			}
			
		}
	}
	
	String pop() {
		if(list.isEmpty()) {
			return null;
		}
		String s = list.get(0);
		list.remove(0);
		
		return s;
	}
	
	String peek() {
		if(list.isEmpty()) {
			return null;
		}
		String s = list.get(0);
		
		return s;
	}
	
	int getSize() {
		return list.size();
	}
	
	boolean empty() {
		boolean a;
		if(list.size() == 0) {
			a=true;
		}
		else {
			a = false;
		}
		
		return a;
	}
}
