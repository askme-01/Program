package com.java.digitFromString;

public class FindDigits {

	public static void main(String[] args) {
		
		String str = "Roshan : 10; Akshay : 02; Chetana : 22";
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			if(Character.isDigit(c)) {
				System.out.print(c + " ");
			}
		}
	}
}
