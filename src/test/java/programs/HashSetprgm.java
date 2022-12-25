package programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetprgm {

	public static void main(String[] args) {
		HashSet<Object> Set= new HashSet<Object>();
		Set.add(null);
		Set.add(0);
		Set.add(null);
		Set.add("hello");
		Set.add(30);
		Set.add(0);
		Set.add(34);
		Set.add("hello");
		Set.add("hii");
		System.out.println(Set);
		System.out.println(Set.isEmpty());
System.out.println(Set.remove("hii"));
System.out.println(Set.size());

if(Set.contains("hii"))
		{
	System.out.println("present");
	
	
}
for(Object obj:Set) {
	System.out.println(obj);
}

System.out.println();
Iterator it=Set.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
