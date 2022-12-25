package StringMethod;

import java.lang.invoke.StringConcatFactory;

public class StringPrgm1 {

	public static void main(String[] args) {
	//	String s="welcome";
		//System.out.println(s.length());
		//String s1="welcome";
		//char[] c=s1.toCharArray();
		//System.out.println(c.length);
		 //String s2="welcome";
		 //System.out.println(s2.charAt(1));
		  //String s3="welcome";
		  //System.out.println(s3.charAt('e'));
		  
		// String s4="hi";
		  //String s5="hello";
		  //String s6="welcome";
		 // System.out.println(s1.concat(s5).concat(s6));
		  
		//  String s20="hi";
		//  String s21="hello";
		//  String s22="welcome";
		//  String joined =String.join(" ", s20,s21,s22);
		//  System.out.println(joined);
		  
		  String s7="welcome";
		System.out.println(s7.contains("lc"));
		 String s8="welcome";
		 System.out.println("me");
		 
		 String s9="welcome";
		 String s10=" ";
		 System.out.println(s10.isEmpty());
		
		 String s11="hi hello welcome";
		 System.out.println(s11.trim());
		 
		 String s12="hii hello welcome";
		 System.out.println(s12.substring(0, 3));
		 
		 String s13="hi hello welcome";
		 String[] s14=s13.split(" ");
		 for(int i=0; i<s14.length; i++) {
			 System.out.println(s14[i]);
		 }
		  String s15="hi";
		  String s16="hi";
		  System.out.println(s16.equals(s15));
  
		   String s17="hi hello welcome";
		   System.out.println(s17.replace(" ",""));
		   
		   
		   String s18="welcome";
		   System.out.println(s18.toLowerCase());
		   
		   String s19="welcome";
		   System.out.println(s19.toUpperCase());
		   
	}

}
