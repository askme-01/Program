package com.java.operationsOnString;

public class CountOfWords {

	public static void main(String[] args) {
		
		String str = "This is check the no of words present in this String";
		
		int count = 0;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
				count++;
			}
		}
		
		System.out.println("Count of words in String :" + count);

	}

}
