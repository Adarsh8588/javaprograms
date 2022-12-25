package programs;

import java.util.LinkedHashSet;

public class Assignment2 {

	public static void main(String[] args) {
	int []a= {4,3,2,3,1};
	System.out.println("the unique numbers are");
	LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
	   for(int i=0; i<a.length;i++) {
		   set.add(a[i]);
		   
	   }
	   for(int b:set)
	   {
   System.out.println(b);
	   
	}
	   
	   System.out.println("the occurance of each no are");
        
	   for( int i=0;i<a.length;i++) {
		   set.add(a[i]);
	   }
	   for(int c:set)
	   {
		   int count=0;
		   for(int i=0;i<a.length;i++) {
			   if(c==(a[i])) {
				 count++;  
			   }
		   }
		   System.out.println(c+"      "+ count);
	   }
	   
	   System.out.println("duplicats no with count");
	   
	   for(int i=0; i<a.length; i++) {
		   set.add(a[i]);
	   }
	   for(int d:set) {
		   int count=0;
		   for(int i=0;i<a.length;i++) {
			   if(d==(a[i])) {
				   count++;
			   }
		   }
		   if(count>1) {
			   System.out.println(d  +  "   "+ count + "times");
		   }
	   }
	   
	   System.out.println("printing only unique no with count");
	   
	   for(int i=0; i<a.length;i++) {
		   set.add(a[i]);
		   
	   }
	   for(int e:set)
	   {
        int count=0;
        for(int i=0;i<a.length;i++) {
        	if(e==(a[i])) {
        		count++;
        	}
        }
	   if(count==1) {
		   System.out.println(e + "      " + count + "times");
	   }
	}
	
	  System.out.println("position of each no with count"); 
	  
	  for(int i=0;i<a.length;i++) {
		  set.add(a[i]);
	  }
	  for(int f:set)
	  {
		  int count=0;
	        for(int i=0;i<a.length;i++) {
	        	if(f==(a[i])) {
	        		count++;
	        	}
	        }
	        
	  }
	  
	  
	   
}
}