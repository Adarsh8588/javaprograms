package programs;

public class Swap {

	public static void main(String[] args) {
		String st="i love banglore city";
		String[] s=st.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		
		for(int i=0;i<s.length-1;i++) {
			System.out.print(s[i]+" ");
		}
         
		
	}

}
