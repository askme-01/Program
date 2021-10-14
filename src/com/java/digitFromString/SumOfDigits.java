package com.java.digitFromString;

public class SumOfDigits {

	public static void main(String[] args) {
		
		String str = "Roshan : 10; Akshay : 02; Chetana : 22";
		int num = 0;
		int sum = 0;
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			if(Character.isDigit(c)) {
				System.out.print(c + " ");
				num = Integer.parseInt(String.valueOf(c));
				sum = sum + num;
			}
		}
		System.out.println("\nSum of the Digits is :" + sum);
	}
}
