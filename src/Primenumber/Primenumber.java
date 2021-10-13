package Primenumber;

public class Primenumber {
public static void main(String[] args) {
	int[] num= {20,25,30};
	for(int i=0; i<num.length ;i++)
	{
		int rem = num[i] %2;
		if(rem==0) {
			System.out.println(num[i]+" Number is even ");
		}
		else {
			System.out.println(num[i]+" Number is odd ");
		}
	}
	
			
}
}
