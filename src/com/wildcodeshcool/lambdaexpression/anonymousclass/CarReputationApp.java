package com.wildcodeshcool.lambdaexpression.anonymousclass;

public class CarReputationApp {

	public static void main(String[] args) {

		Car myCar1 = new Car("High performance"); // instantiated object of class car
		Reputation info = myCar1.getInformation();
		myCar1.addReputation("New car");
		myCar1.addReputation("Comfortable to drive");
		myCar1.addReputation("Low price");
		System.out.println("Car 1 reputations:\n" + info.getInfo());

		Car myCar2 = new Car();
		Reputation info2 = myCar2.getInformation();

		System.out.println("\nCar 2 reputations:\n" + info2.getInfo());

	}
}