package com.wildcodeshcool.lambdaexpression.classicinterfaceimplementation;

public class ReputationImpl implements Reputation {

	@Override
	public String getInfo(Car car) {
		String returns = "";

		if (car.getInitialReputation() == null) {
			returns = Reputation.super.getInfo(car);
		} else {
			returns = car.getInitialReputation();
		}

		for (String ret : car.getReputations()) {
			returns += "\n" + ret;
		}

		return returns;
	}

}
