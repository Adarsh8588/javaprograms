package programs;

import org.testng.annotations.Test;

public class ArrayProgram1 {
	@Test
	public static void main(String[] args) {
		int a=20;
		int b=10;
		System.out.println("before swap ==> A value is ="+ a +" &   B value is = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After  swap ==> A value is ="+ a +" &   B value is = "+b);
		}


}
