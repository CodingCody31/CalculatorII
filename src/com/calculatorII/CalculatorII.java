package com.calculatorII;
import java.util.ArrayList;

public class CalculatorII implements java.io.Serializable{
	
	private static double answer;
	private static ArrayList<Double> num = new ArrayList<Double>();
	private static ArrayList<String> operation = new ArrayList<String>();

	
	public CalculatorII() {
		
	}
	
	public ArrayList<Double>operand(){
		return num;
	}
	
	public ArrayList<String>operation(){
		return operation;
	}
	
	
	public void performOperation(double number) {
		num.add(number);
	}
	public void performOperation(String operator) {
		operation.add(operator);
	}
	
	public void getResults() {
		for(int i = 0; i < operation.size(); i ++) {
			if (operation.get(i) == "*" || operation.get(i) == "/") {
				if (operation.get(i) == "*") {
					answer = num.get(i) * num.get(i + 1);
				}
				else if (operation.get(i) == "/") {
					answer = num.get(i) / num.get(i + 1);
				}
				num.set(i + 1, answer);
				num.remove(i);
				operation.remove(i);
			}
		}
		for(int i = 0; i < operation.size(); i ++) {
			i = 0;
			if (operation.get(i) == "+" || operation.get(i) == "-") {
				if (operation.get(i) == "+") {
					answer = num.get(i) + num.get(i + 1);
				}
				else if (operation.get(i) == "-") {
					answer = num.get(i) - num.get(i + 1);
				}
				num.set(i + 1, answer);
				num.remove(i);
				operation.remove(i);
			}
		}
		
		if (operation.get(0) == "=") {
			System.out.println("Answer is: " + num);
		}
	}
}
