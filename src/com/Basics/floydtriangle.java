package com.Basics;

public class floydtriangle {
	
	public static void main(String []args) {
		
		int num=161;
		int a=num;
		int rem=0;
		int rev=0;
		
		while(a!=0) {
			
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			
		}
		
		if(num==rev) {
			
			System.out.println(num +"  is an palindrome");
		}
		
		else {
			
			
			System.out.println(num +"  is not palindrome number");
					
		}		
		
}
}