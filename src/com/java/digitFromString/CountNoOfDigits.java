package com.java.digitFromString;

public class CountNoOfDigits {

	public static void main(String[] args) {
		
		String str = "Roshan : 10; Akshay : 02; Chetana : 22";
		int digits = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >=48 && str.charAt(i) <=57)
				digits++;
		}
		
		System.out.println("No. of digits in the String :" + digits);

	}

}
