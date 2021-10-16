package com.java.digitFromString;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		String str = "Roshan : 10; Akshay : 02; Chetana : 22";
		
		System.out.println(sumOfNumber(str)); 	 	

	}
	
	public static int sumOfNumber(String s) {
		 // A temporary string
		String temp = "0";
        // holds sum of all numbers present in the string
	    int sum = 0;
		
        // read each character in input string
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			 // if current character is a digit
			if(Character.isDigit(ch)) {
				temp += ch;
				// if current character is an alphabet
			}else {
				 // increment sum by number found earlier
                // (if any)
				sum += Integer.parseInt(temp);
				  // reset temporary string to empty
				temp = "0";
			}
		}
		//takes care of trailingnumbers
		 return sum + Integer.parseInt(temp);
	}

}
