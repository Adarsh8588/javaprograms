package StringMethod;

public class MaxLengthInArray {

	public static void main(String[] args) {
		String[] s= {"123456","34578","3454","2","23"};
		String maxlength=s[0];
		
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>maxlength.length()) {
				maxlength=s[i];
			}
		}
		for(int i=0; i<s.length; i++) {
			if(s[i].length()==maxlength.length()) {
				System.out.println(s[i]);
			}
		}

	}

}
