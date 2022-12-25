package programs;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetTest {
	@Test
	public void sort() {
		TreeSet<Integer> ss=new TreeSet<Integer>();
		ss.add(10);
		ss.add(30);
		ss.add(5);
		ss.add(2);
		ss.add(6);
		ss.add(7);
		System.out.println(ss);
		 for(int set:ss) {
			 System.out.println(set);
		 }
		 System.out.println();
		 System.out.println(ss.first());
		 System.out.println(ss.headSet(5));
		 System.out.println(ss.tailSet(7));
	}

}
