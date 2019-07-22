package com.calculatorII;

public class CalculatorIITest {
	public static void main(String[] args) {
		CalculatorII calc = new CalculatorII();
		calc.performOperation(10.5);
		calc.performOperation("+");
		calc.performOperation(5.2);
		calc.performOperation("*");
		calc.performOperation(10);
		calc.performOperation("=");
		calc.getResults();
		
		
	}

}
