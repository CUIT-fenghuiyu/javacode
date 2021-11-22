package com.Google;

public class NegativeFilter extends Filter{
	int[] arr;
	
	NegativeFilter(String name, int[] arr){
		super(name);
		this.arr = arr;
	}
	
	@Override
	public void doFilter() {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = Math.abs(arr[i]);
			}
		}
	}
}
