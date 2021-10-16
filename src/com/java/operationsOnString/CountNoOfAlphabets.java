package com.java.operationsOnString;

public class CountNoOfAlphabets {

	public static void main(String[] args) {
		
		String str = "ten is 10";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <=57) {
				
			}else {
			    if(str.charAt(i) != ' ') {
				count++;
			    }
			}
		}
		System.out.println("The no. of Alphabets are : " + count);
	}
}
