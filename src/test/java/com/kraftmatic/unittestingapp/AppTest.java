package com.kraftmatic.unittestingapp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

	Calculator calculator;

	@Mock
	RandomNumberGenerator generator;

	@Before
	public void setup() {
		calculator = new Calculator(generator);
	}

	@After
	public void tearDown() {
		calculator = null;
		generator = null;
	}

	@Test
	public void testThatTwoPlusTwoEqualsFour() {
		int result = calculator.add(2, 2);
		assertEquals(4, result);
	}

	@Test
	public void testThatTwoPlusFiveEqualsSeven() {
		int result = calculator.add(2, 5);
		assertEquals(7, result);
	}

	@Test
	public void testThatTheSumOfTwoThreeAndFourIsNine() {
		List<Integer> intArray = new ArrayList<Integer>();
		intArray.add(2);
		intArray.add(3);
		intArray.add(4);

		Integer sum = calculator.sum(intArray);
		assertEquals("9", sum.toString());
	}

	@Test
	public void testThatEightDividedByTwoIsFourThroughRandomNumberGenerator() {
		double myDouble = 8D;
		when(generator.returnRandomNumber()).thenReturn(2D);

		double response = calculator.divideThisByARandomDouble(myDouble);
		assertEquals("4.0", String.valueOf(response));
	}

}
