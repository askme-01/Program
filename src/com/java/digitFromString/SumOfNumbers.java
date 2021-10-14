package com.java.digitFromString;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		String str = "Roshan : 10; Akshay : 02; Chetana : 22";
		
		System.out.println(sumOfNumber(str)); 	 	

	}
	
	public static int sumOfNumber(String s) {
		
		String temp = "0";
	    int sum = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				temp += ch;
			}else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		 return sum + Integer.parseInt(temp);
	}

}
