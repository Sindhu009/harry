package xworkz.com.FunctionalinterfaceExamplde;

import xworkz.com.FunctionalinterfaceExamplde.hi.OneArgument;

public class OneArgumentTester {
	public static void main(String[] args) {

		OneArgument onearg=(int a)->{
			System.out.println("The sum is :"+( a+5));
			return a;
		};
		onearg.incrementByFive(5);
	}
	

}
