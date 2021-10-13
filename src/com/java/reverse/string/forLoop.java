package com.java.reverse.string;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String you want to reverse : ");
		String str = scanner.nextLine();
		
		for(int i=str.length(); i>0; i--) {
			System.out.print(str.charAt(i-1));
		}

	}

}
