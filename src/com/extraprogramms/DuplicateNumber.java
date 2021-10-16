package com.extraprogramms;

import java.util.Arrays;

//
public class DuplicateNumber {
public static void main(String[] args) {
	int[] arra= {1,5,7,8,1,7,7,8,1,5,1};
	FindDuplicateNumber(arra);
	
}

public static void FindDuplicateNumber(int[] n)
{
	Arrays.sort(n);
	for(int i=0; i<n.length-1;i++)
	{
		int count=1;
		for(int j=i+1;j<n.length;j++)
		{
			if(n[i]==n[j])
				count++;
			else
				break;
		}
		if(count>1)
		{
			System.out.println(n[i]+"->"+count);
			i+=(count-1);//important 
		}
		
	}
}
}
