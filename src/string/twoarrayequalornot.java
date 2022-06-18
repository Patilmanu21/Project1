package string;

import java.util.Arrays;

public class twoarrayequalornot {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4};
		int[]b= {1,2,3,4};
		
		/*String[]a= {"cat,bat,hat"};
		String[]b= {"cat,bat,hat"};*/
		
		/*boolean result=Arrays.equals(a,b);
		 
		System.out.println(result);*/
		
		
		/*if(Arrays.equals(a,b)) {
			
			System.out.println("Arrays are equal");
		}
		
		else {
			
			System.out.println("Arrays are not equal");
			
					}*/
		
		boolean result=true;
		
		if(a.length==b.length) {
			//compare rest of elements
			
			for(int x=0; x<a.length; x++) {
				
				if(a[x]!=b[x]) {
					
					result=false;
				}
			}
			
		}
		
		else {
			
			result=false;
			
		}
		
		if (result==true) {
			
			System.out.println("Both arrays are equal");
		}
		
		else {
			
			System.out.println("Both arrays are not equal");
		}

	}

}
