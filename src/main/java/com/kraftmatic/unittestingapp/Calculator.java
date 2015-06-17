package com.kraftmatic.unittestingapp;

import java.util.List;

public class Calculator {

	private RandomNumberGenerator generator;

	public Calculator() {
		new Calculator(generator);
	}

	public Calculator(RandomNumberGenerator generator) {
		this.generator = generator;
	}

	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public Integer sum(List<Integer> intArray) {
		Integer sum = 0;
		for (Integer digit : intArray) {
			sum += digit;
		}
		return sum;
	}

	public Double divideThisByARandomDouble(Double dubs) {
		return dubs / generator.returnRandomNumber();
	}

}
