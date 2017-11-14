package com.example.maven.first_maven_junit_project;

public class Main {

	public static void main(String[] args) {
		
				Calculater calculator = new Calculater();
				double firstNumer = 10.0;
				double secondNumber = 0.0;
				System.out.println("Addition: "+ calculator.addition(firstNumer, secondNumber));
				System.out.println("Subtraction: "+ calculator.subtraction(firstNumer, secondNumber));
				System.out.println("Multiplication: "+ calculator.multiplication(firstNumer, secondNumber));
				System.out.println("Division: "+ calculator.division(firstNumer, secondNumber));
				


	}

}
