package programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {

	public static void main(String[] args) {
	LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		set.add(null);
		set.add(0);
		set.add(null);
		set.add("hello");
		set.add(30);
		set.add(0);
		set.add(34);
		set.add("hello");
		set.add("hii");
		System.out.println(set);
		System.out.println(set.isEmpty());
System.out.println(set.remove("hii"));
System.out.println(set.size());

if(set.contains("hii"))
		{
	System.out.println("present");
	
	
}
for(Object obj:set) {
	System.out.println(obj);
}

System.out.println();
Iterator it=set.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}


	}

}
