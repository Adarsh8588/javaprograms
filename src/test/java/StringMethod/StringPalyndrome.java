package StringMethod;

public class StringPalyndrome {

	public static void main(String[] args) {
		String s="aba";
		String rev="";
		for(int i=s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("is palyndrome");
		}
		else {
			System.out.println("not a palyndrome");
		}
	}

}
