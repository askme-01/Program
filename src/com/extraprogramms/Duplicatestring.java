package com.extraprogramms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Duplicatestring {
	public static void main(String[] args) {
		FindDuplicateString("I am am very good programmer programmer");
		FindDuplicteCharacter("askhay");
	}

	public static void FindDuplicateString(String str) {
		Map<String, Integer> hm = new HashMap<>();
		String[] s = str.split(" "); // means we will split on space between them
		for (String tempstring : s) {
			if (hm.get(tempstring) != null) {
				hm.put(tempstring, hm.get(tempstring) + 1);
			} else {
				hm.put(tempstring, 1);
			}
		}
		Iterator<String> tempstring = hm.keySet().iterator();
		while (tempstring.hasNext()) {
			String temp = tempstring.next();
			if (hm.get(temp) > 1) {
				System.out.println("the word " + temp + " appeared " + hm.get(temp) + " no. of times");
			}
		}

	}
	
	public static void FindDuplicteCharacter(String str) {
		Map<Character, Integer> hc = new HashMap<>();
		for(int i=0 ;i < str.length();i++)
		{
			char ch = str.charAt(i);
			if (hc.get(ch) != null) {
				hc.put(ch, hc.get(ch) + 1);
			} else {
				hc.put(ch, 1);
			}
		}
		System.out.println(hc);
		
		
	}
}
