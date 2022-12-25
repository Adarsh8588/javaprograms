package programs;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateLtr {

	public static void main(String[] args) {
		String st="i love banglore citry i love me";  // it will remove repeated words
		String[] s=st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
   for(int i=0; i<s.length;i++) {
	   set.add(s[i]);
	   
   }
   for(String str1:set) {
	   System.out.print(str1+" ");
   }
	}

}
