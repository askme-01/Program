package com.java.reverse.string;

public class StaticMethod {

	public static void main(String[] args) {
		
		String str = "Roshan Akshay Chetana Shetye";
		System.out.println("Reverse of String :" + reverse(str));

	}
	
	public static String reverse(String s) {
		String reverse = "";
		for(int i=s.length(); i>0; i--) {
			reverse = reverse + s.charAt(i-1);
		}
		return reverse;
	}

}
