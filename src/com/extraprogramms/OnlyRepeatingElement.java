package com.extraprogramms;

import java.util.HashSet;

public class OnlyRepeatingElement {
	static int findRepeating(int arr[], int n) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if (s.contains(arr[i])) {
//	        	return arr[i];
				System.out.println(arr[i]);
			} else
				s.add(arr[i]);
		}
		return -1;
	}

	
	// Driver code
	public static void main(String[] args) {
		int arr[] = { 9, 1, 2, 5, 1, 8, 5, 3, 4, 7 };
		int n = arr.length;
//	    System.out.println(findRepeating(arr, n));
		findRepeating(arr, n);
	}
}
