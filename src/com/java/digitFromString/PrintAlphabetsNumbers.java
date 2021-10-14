package com.java.digitFromString;

public class PrintAlphabetsNumbers {

	public static void main(String[] args) {
		
		String str = "Roshan : 10; Akshay : 02; Chetana : 22";
		
		String replaced = str.replaceAll(": ", "");
		
		String alphabet = "";
		String num = "";
		
		char[] ch = replaced.toCharArray();
		
		for(char c : ch) {
			if(Character.isDigit(c)) {
				num = num + c + " ";
			}else {
				alphabet = alphabet + c;
			}
		}
		System.out.println("Alphabet :" + alphabet);
		System.out.println("Number :"+ num);
	}
}
