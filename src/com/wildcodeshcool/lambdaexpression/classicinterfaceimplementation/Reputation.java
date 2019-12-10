package com.wildcodeshcool.lambdaexpression.classicinterfaceimplementation;

interface Reputation {

	default public String getInfo(Car car) {
		return "Bad for business";
	}
}
