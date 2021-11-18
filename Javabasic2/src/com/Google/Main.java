package com.Google;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		int Savmount = scanner.nextInt();
		double num = 0;
		
		for(int i=0; i<6; i++) {
			num += Savmount;
			num *= (1 + 0.00417);
		}
		
		System.out.printf("Enter the monthly saving amount:\nAfter ths sixth month,the account value is $%.2f\n",num);
	}
}
