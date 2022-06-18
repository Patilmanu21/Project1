package string;

import java.util.Arrays;

public class S2 {

	public static void main(String[] args) {
		String str = "madam";
		String og = str;
		String rev ="";
		for(int i=str.length()-1; i>=0; i--)
		{
		rev = rev + str.charAt(i);
		}
		if(og.equals(rev))
		{
		System.out.println("String is Palindrom");
		}
		else
		{
		System.out.println("String is not Palindrom");
		}
		
		
        
        
        


	}

}
