package com.Google;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		String s = "";
		int num = scanner.nextInt();
		int tmp = 0;
		int x;
		
		for(int i=0; i<9; i++) {
			x = num % 10;
			num /= 10;
			arr.add(0,x);
		}
		
		for(int i=0; i<9; i++) {
			tmp += arr.get(i) * (i+1);
		}
		tmp %= 11;
		arr.add(arr.size(),tmp);
		
		for(int i=0; i<9; i++) {
			s += arr.get(i);
		}
		
		if(arr.get(arr.size()-1) == 10) {
			s += 'X';
		}else {
			s += arr.get(arr.size()-1);
		}
		
		System.out.print(s);
	}

}
