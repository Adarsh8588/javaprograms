package StringMethod;

import java.util.LinkedHashSet;

public class PositionOfCharByRemovingDuplicate {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) { //0<6 
			set.add(s.charAt(i));//0
			
		}
		for(Character ch:set) {//0
			for(int i=s.length()-1; i>=0;i--) { //6-1 5>1
				if(ch==s.charAt(i)) { //0==0
					System.out.println(ch+"   "+(i+1)); //t 0+1=1
					break;
				}
			}
		}


	}

}
