package SRP.calculator;

import SRP.calculator.Addition;
import SRP.calculator.Calculator;
import SRP.calculator.Division;
import SRP.calculator.Multiplication;
import SRP.calculator.Subtraction;

public class CalculatorTest {

	public static void main(String[] args) {
         
		Calculator calculator = new Calculator(10, 5);
		
		Addition addition = new Addition();
		System.out.println("Addition : " + addition.add(calculator.getNumber1(), calculator.getNumber2()));
		
		
		Subtraction subtract = new Subtraction();
		System.out.println("Subtraction : " + subtract.subtract(calculator.getNumber1(), calculator.getNumber2()));
		
		Multiplication muliply = new Multiplication();
		System.out.println("Multiplication : " + muliply.multiply(calculator.getNumber1(), calculator.getNumber2()));
		
		Division divide = new Division();
		System.out.println("Division : " + divide.divide(calculator.getNumber1(), calculator.getNumber2()));
		
		
	}

}
