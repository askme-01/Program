package com.java.rotationalString;

public class RotationalString {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "ajav";
		
		System.out.println("Checking whether string is rotational of another");
		if(checkRotating(str1, str2)) {
			System.out.println("Strings are rotation of each other.....");
		}else {
			System.out.println("Strings are not rotation of each other....");
		}
	}
	
	static boolean checkRotating(String s1, String s2) {
		
		String temp = s1 + s2;
		
		return (s1.length() == s2.length() && temp.contains(s2));
	}

}
