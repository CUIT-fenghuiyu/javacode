package com.Google;
import java.util.ArrayList;

class Queue {
	ArrayList<String> list = new ArrayList<String>();

	void offer(String s) {
		for(int i=0; i<s.length(); i++) {
			String tmp = "";
			int j=0;
			while(i<s.length() && s.charAt(i) != ' ' && s.charAt(i) != '?') {
				tmp += s.charAt(i);
				i++;
				j=1;
			}
			if(j==1) {
				list.add(list.size(), tmp);
			}
		}
	}
	
	String peek() {
		if(list.isEmpty()) {
			return null;
		}
		
		return list.get(0);
	}
	
	String pull() {
		if(list.isEmpty()) {
			return null;
		}
		
		String s = list.get(0);
		list.remove(0);
		return s;
	}
	
	boolean empty() {
		boolean a;
		
		if(list.isEmpty()) {
			a = true;
		}else {
			a = false;
		}
		
		return a;
	}
	
	int getSize() {
		
		return list.size();
	}
}
