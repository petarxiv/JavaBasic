package class12;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator simpleMathCalculator=new Calculator();
		simpleMathCalculator.add();
	
		
		simpleMathCalculator.addNumbers(10,25);
		
		simpleMathCalculator.addNumbers(30,30);
		int number1=50;
		int number2=50;
		simpleMathCalculator.addNumbers(number1, number2);
	}

}
