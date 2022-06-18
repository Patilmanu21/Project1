package string;

public class Duplicatestring {

	public static void main(String[] args) {
	
		String s="Java is a object oriented java programming java object";
		int count;
		
		s=s.toLowerCase();
		
		
		
	 String words[]=s.split(" ");
		
		System.out.println("Dulipcate words in string:  ");
		
		for(int a=0; a<words.length; a++) {
			
			count=1;
			
			for(int b=a+1; b<words.length; b++) {
				
				if(words[a].equals(words[b])) {
					count++;
					words[b]="0";	
					
				}
				
			}	
			
			if(count>1 && words[a]!="0") {
				
				System.out.println(words[a]);
			}
			
			
			
		}
			

	}

}
