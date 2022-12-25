package StringMethod;

import java.util.Scanner;

public class Fibonasys {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ;
	int fib1=0;
	int fib2=1;
	int fib3;
	System.out.println(fib1+" "+fib2);
	 for(int i=0;i<=10;i++) {
		 fib3=fib1+fib2;
		 fib1=fib2;
		 fib2=fib3;
		 System.out.println(fib3);
	 }

	}

}
