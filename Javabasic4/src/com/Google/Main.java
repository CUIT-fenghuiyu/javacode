package com.Google;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static String decimalToBinary(int val) {
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		String bstring = "";
		
		while(val > 0) {
			list.add(0, val%2);
			val /= 2;
		}
		
		for(int i=0; i<list.size(); i++) {
			bstring += list.get(i);
		}
		
		return bstring;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(decimalToBinary(scanner.nextInt()));
	}

}

