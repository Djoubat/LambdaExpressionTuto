package com.wildcodeshcool.lambdaexpression.lambda_expression;

import java.util.ArrayList;
import java.util.List;

class Car {
	private String initialReputation = null;
	private List<String> reputations = new ArrayList<String>();
	private Reputation information = () -> {
		String returns = "";

		if (initialReputation == null) {
			returns = "Bad for business";
			;
		} else {
			returns = initialReputation;
		}

		for (String ret : reputations) {
			returns += "\n" + ret;
		}
		return returns;
	};

	public Car() {
	}

	public Car(String initialReputation) {
		this.initialReputation = initialReputation;
	}

	public void addReputation(String reputation) {
		reputations.add(reputation);
	}

	public Reputation getInformation() {
		return information;
	}

	public void setInformation(Reputation information) {
		this.information = information;
	}

	public String getInitialReputation() {
		return initialReputation;
	}

	public void setInitialReputation(String initialReputation) {
		this.initialReputation = initialReputation;
	}

	public List<String> getReputations() {
		return reputations;
	}

	public void setReputations(List<String> reputations) {
		this.reputations = reputations;
	}

}