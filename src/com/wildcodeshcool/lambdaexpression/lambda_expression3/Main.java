package com.wildcodeshcool.lambdaexpression.lambda_expression3;

public class Main {

	String thirdtext = "this is my third text";

	public void doIt() {

		final String hello = "Hello "; // locale variable

		MyInterface2 m = text -> System.out.println("Hello " + hello + text + " " + thirdtext + " !");

		m.myprint("Ayoub");

		thirdtext = "je peux le modifier";

		m.myprint("Vincent");

	}

	public static void main(String[] args) {

		// Java lambda expression can implement interfaces with
		// a single unimplemented method (abstract) method,
		// but as many default or static methods as you like

		MyInterface myInterface = () -> {

			System.out.println("Hello world");
		};

//		myInterface.helloWorld();
//		myInterface.helloWorld2();
//		MyInterface.helloWorld3();
//		
//		MyInterface myInterface2 = myInterface;
//	
//		myInterface2.helloWorld();

//		hello = "Hi"; // locale variable must be finale or effective finale
		
		new Main().doIt();

	}

}
