package test;

import java.util.Comparator;

import com.wildcodeshcool.lambdaexpression.lambda_expression2.MyComparator;

public class Main {

	public static void main(String[] args) {
		
		String str1 = "hs";
		String str2 = "ht";
		
		Comparator<String> stringComparator = (s1, s2) -> s1.compareTo(s2);
		
		
		
		
		int result = stringComparator.compare(str1, str2);
		
		System.out.println(result);

	}

}
