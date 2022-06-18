package string;

import java.util.Arrays;

public class String1 {
//count number of space 
    public static void main(String [] args) {
		
   String s="Be charm everything will be alright";
   
   int num=0;
   
   for(char c:s.toCharArray()) {
	   
	   if(c==' ') {
		   
		  num++; 
	   }
   }
       System.out.println("count the space of the given string: "+num);
   


}
}