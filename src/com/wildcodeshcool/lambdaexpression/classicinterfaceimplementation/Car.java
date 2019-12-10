package com.wildcodeshcool.lambdaexpression.classicinterfaceimplementation;

import java.util.ArrayList;
import java.util.List;

class Car {

	private String initialReputation = null;
	private List<String> reputations = new ArrayList<String>();

	public Car() {
	}

	public Car(String initialReputation) {
		this.initialReputation = initialReputation;
	}

	public void addReputation(String reputation) {
		reputations.add(reputation);
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