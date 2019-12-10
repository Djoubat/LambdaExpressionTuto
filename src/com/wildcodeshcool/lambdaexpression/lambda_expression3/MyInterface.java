package com.wildcodeshcool.lambdaexpression.lambda_expression3;

@FunctionalInterface
public interface MyInterface {
	
	public void helloWorld();
	
	default public void helloWorld2() {
		
		System.out.println("Hello default");
	}
	
	static void helloWorld3() {
		
		System.out.println("Hello static");
	}
	// public void helloWorld3(String toto); // we can't define two abstract methods in the same functionnal interface

}
