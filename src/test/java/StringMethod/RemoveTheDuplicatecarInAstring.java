package StringMethod;

import java.util.HashSet;

public class RemoveTheDuplicatecarInAstring {

	public static void main(String[] args) {
		String s="tester";
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0; i<s.length(); i++)
{
	hs.add(s.charAt(i));
	
}
		System.out.println(hs);
	}

}
