package com.java.digitFromString;

public class FindNumbers {

	static String extractNumber(String str) {
		
	      // Replacing every non-digit number
        // with a space(" ")
        str = str.replaceAll("[^\\d]", " ");
  
        // Remove extra spaces from the beginning
        // and the ending of the string
        str = str.trim();
  
        // Replace all the consecutive white
        // spaces with a single space
        str = str.replaceAll(" +", " ");
  
        if (str.equals(""))
            return "-1";
  
        return str;
    }
  
    // Driver code
    public static void main(String[] args)
    {
        String str = "Roshan : 10; Akshay : 02; Chetana : 22";
        System.out.print(extractNumber(str));
    }

}

