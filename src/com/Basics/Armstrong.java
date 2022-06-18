package com.Basics;

public class Armstrong {

	public static void main(String[] args) {
	    
		int no=153;
		int a=no;
		int rem=0;
		int sum=0;
		
		
		while(no!=0) {
			
			rem=no%10;
			no=no/10;
			sum=sum +(rem*rem*rem);
	
		}
		
		if(a==sum) {
			
			System.out.println(a +"  is armstrong number");
		}
		
		else {
			
			System.out.println(a +"   is not armstrong number");
		}

	}

}
