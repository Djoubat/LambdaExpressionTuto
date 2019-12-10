package com.wildcodeshcool.lambdaexpression.lambda_expression;

public class CarReputationApp {

	public static void main(String[] args) {

		Car myCar1 = new Car("High performance"); // instantiated object of class car
		myCar1.addReputation("New car");
		myCar1.addReputation("Comfortable to drive");
		myCar1.addReputation("Low price");
		System.out.println("Car 1 reputations:\n" + myCar1.getInformation().getInfo());

		Car myCar2 = new Car();
		System.out.println("\nCar 2 reputations:\n" + myCar2.getInformation().getInfo());

	}
}