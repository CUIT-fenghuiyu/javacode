package com.Google;

public class WordFilter implements Filter{
	String word;
	
	void setWord(String word) {
		this.word = word;
	}
	
	String getWord() {
		return word;
	}
	
	WordFilter(String word){
		this.word = word;
	}
	
	@Override
	public void doFilter() {
		word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
	}
	
	
}
