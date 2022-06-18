package com.Basics;

import java.util.Arrays;

public class Practise {
	
	public static void main(String []args) {
		
		 String str="madam";
			
			String og=str;
			
			String rev=" ";
			
			
			for(int a=str.length()-1; a>=0; a--) {
			
			
			 rev=rev+str.charAt(a);
			
			}
			
			if(og.equals(rev)) {
			
			
			        System.out.println("String is an palindrome");
			
			}
			
			else {
			
			
			   System.out.println("String is not an palindrome");
			
			}


				
				
	
			 
		
		
		
		
		
			
	}
}
	


		
			
	