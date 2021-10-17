package com.primenumber;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		int num = 0;
		boolean status = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();

		if (num == 0 || num == 1) {
			System.out.println("Number is not prime ");
		}

		else {
			for (int i = 2; i <=num / 2; i++) {
				if (num % i == 0) {
					System.out.println("Number is not prime ");
					status = false;
					break;
				}

			}
			if (status == true) {
				System.out.println("Number is a prime ");
			}

		}

	}
}
