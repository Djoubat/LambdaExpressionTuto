package com.wildcodeshcool.lambdaexpression.classicinterfaceimplementation;

public class CarReputationApp {

	public static void main(String[] args) {

		Car myCar1 = new Car("High performance"); // instantiated object of class car
		ReputationImpl reputationImpl = new ReputationImpl();

		myCar1.addReputation("New car");
		myCar1.addReputation("Comfortable to drive");
		myCar1.addReputation("Low price");
		System.out.println("Car 1 reputations:\n" + reputationImpl.getInfo(myCar1));

		Car myCar2 = new Car();
		System.out.println("\nCar 2 reputations:\n" + reputationImpl.getInfo(myCar2));

	}
}