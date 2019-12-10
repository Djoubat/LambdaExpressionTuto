package com.wildcodeshcool.lambdaexpression.anonymousclass;

import java.util.ArrayList;
import java.util.List;

class Car {
	private String initialReputation = null;
	private List<String> reputations = new ArrayList<String>();
	private Reputation information = new Reputation() { // Anonymous inner class
		@Override // Overriding interface default method
		public String getInfo() {
			String returns = "";
			if (initialReputation == null) {
				returns = Reputation.super.getInfo();
			} else {
				returns = initialReputation;
			}
			for (String ret : reputations) {
				returns += "\n" + ret;
			}
			return returns;
		}
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