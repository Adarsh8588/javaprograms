package programs;

public class ReverceTheWords {

	public static void main(String[] args) {
		String st="I Love Banglore";
		
	    String[] s=st.split(" ");
		 
	   for(int i=0; i<st.length()-1; i++) {
		  String str=s[i];
		  for(int j=str.length()-1;j>=0;j--) {
			  System.out.println(str.charAt(i));
		  }
	   }
	   
	   System.out.println(" ");

		
	   }
			}

