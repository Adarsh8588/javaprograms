package StringMethod;

public class ReverseAstring {

	public static void main(String[] args) {
		String s="welcome";
		
		 for(int i=s.length()-1; i>=0; i--)
		 {
			 System.out.println(s.charAt(i));
		 }
          
	  String st="welcome";
	  char[] s1=st.toCharArray();
	  int count=0;
	  
	  for(char c:s1) {
		  count++;
	  }
	  for(int i=count-1; i>=0; i--) {
		  System.out.println(s1[i]);
	  }
		 
	  String s2="welcome";
	   char[] c=st.toCharArray();
	   for(int i=c.length-1; i>=0; i--) {
		   System.out.println(c[i]);
	   }
	  
	  
	}

}
