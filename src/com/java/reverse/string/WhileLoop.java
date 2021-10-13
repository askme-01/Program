package com.java.reverse.string;

public class WhileLoop {

	public static void main(String[] args) {
		
		String str = "Roshan";
		
		int i = str.length();
		while(i>0) {
			System.out.print(str.charAt(i-1));
			i--;
		}

	}

}
