package com.java.reverse.string;

public class UsingArray {

	public static void main(String[] args) {
		
		String str = "Akshay";
		
		char[] ch = str.toCharArray();
		
		for(int i=ch.length; i>0; i--) {
			System.out.print(ch[i-1]);
		}

	}

}
