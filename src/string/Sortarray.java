package string;

import java.util.Arrays;

public class Sortarray {

	public static void main(String[] args) {
		
		/*int[]array=new int[] {20, 5, 10, 7, 30, 60};
		
		Arrays.sort(array);
		
		System.out.println("Elements are in ascending order:  ");
		
		for(int i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}*/
		
		
		int[]x=new int[] {40, 5, 10, 7, 20, 60};
		int temp=0;
		
		
		for(int i=0; i<x.length; i++) {
			
			for(int j=i; j<x.length; j++) {
				
				 if (x[i]>x[j]) {
					 
					 temp=x[i];
					 x[i]=x[j];
					 x[j]=temp;
				 
			}
		}
			System.out.println(x[i]);
		
	 
		}
	}
}