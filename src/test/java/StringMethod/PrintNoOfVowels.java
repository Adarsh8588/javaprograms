package StringMethod;

public class PrintNoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="india";
		int count=0;
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
