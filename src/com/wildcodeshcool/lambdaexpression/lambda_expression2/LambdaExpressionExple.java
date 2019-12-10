package com.wildcodeshcool.lambdaexpression.lambda_expression2;

import java.util.Comparator;

public class LambdaExpressionExple {
	
	public static void main(String[] args) {
		
		// classic implementation
		Comparator<String> stringComparator0 = new MyComparator();
		
		
		// anonymous interface implementation 
		Comparator<String> stringComparator = new Comparator<String>() {
			
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		};
		
		int result0 = stringComparator0.compare("hello", "world");
		
		System.out.println("result with classic implementation: " + result0);
		
		
		int result = stringComparator.compare("hello", "world");
		
		System.out.println("result annonymous implementation : " + result);
		
		// Lambda expression
		Comparator<String> stringComparatorLambda = (arg0, arg1) -> {
			System.out.println("this is the lambda expresion");
			return arg0.compareTo(arg1);
		};
		
		int result2 = stringComparatorLambda.compare("hello", "world");
		
		System.out.println("result with lambda : " + result2);
	}

}
