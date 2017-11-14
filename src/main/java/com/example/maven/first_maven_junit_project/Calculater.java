package com.example.maven.first_maven_junit_project;

public class Calculater {
	public double addition(double firstnumber, double secondnumber) {
		double resultat = firstnumber + secondnumber;
		return resultat;
	}
	
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public double division(double firstNumber, double secondNumber) {
		if (secondNumber == 0.0) {
			System.out.println("You can not perform a division by zero!");
			return -100.00;
		}		
		
		return firstNumber / secondNumber;
	}
}
