package StringMethod;

import java.util.LinkedHashSet;

public class PrintNoOfVowelsWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s="indiaa";
		LinkedHashSet<Character> sa=new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++) {
			sa.add(s.charAt(i));
		}
     
         
          for(char ab:sa) {
        	  for(int i=0; i<s.length();i++) {
        		  char ch = s.charAt(i);
        		  if(ab==ch) {
        		  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        			  count ++;
        			  break;
        		  }
        		  
        	  }
          }
          
	}
          System.out.println(count);
	}

}
