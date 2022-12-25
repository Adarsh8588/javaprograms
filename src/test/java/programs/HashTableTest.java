package programs;

import java.util.Hashtable;

import org.testng.annotations.Test;

public class HashTableTest {
 @Test
	public void hashtable() {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String> ();
		 ht.put(10, "hii");
		 ht.put(20, "hello");
		 ht.put(10,"hello");
		 ht.put(5, "bye");
		 ht.put(3, "hello");
		 System.out.println(ht);
		 System.out.println(ht.remove(3));
		 System.out.println(ht.size());
		 System.out.println(ht.contains(5));
		 System.out.println(ht.replace(10," bye"));
		 System.out.println(ht.get(5));
		 System.out.println(ht);
	}
}
