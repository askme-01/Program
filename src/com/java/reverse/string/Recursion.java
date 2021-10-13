package com.java.reverse.string;

public class Recursion {

	public static void main(String[] args) {
		
		String str = "Chetana";
		
		System.out.println("Resverse of String is :" + reverse(str));
	}
	
	public static String reverse(String s) {
		
		if(s.length() == 0) {
			return "";
		}
		return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
	}

}
