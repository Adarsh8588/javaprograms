package StringMethod;

public class AddIntegerInaString {

	public static void main(String[] args) {
		String s="b2c3d1";
		int sum =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				int n=s.charAt(i)-48; //48 num is constant
				sum=sum+n;
			}
		}
		System.out.println(sum);

	}

}
