package StringMethod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class p2 {
public static void main(String[] args) {
	HashSet<Integer> a = new HashSet<Integer>(10);
	a.add(1);
	a.add(null);
	a.add(10);
	a.add(5);
	a.add(5);
	System.out.println(a);
}
}
