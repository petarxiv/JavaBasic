package class7;

import java.util.Scanner;

public class MoreExamples {

	public static void main(String[] args) {

		Scanner calc = new Scanner(System.in);

		System.out.println("Please enter 2 numbers:");
		int num1 = calc.nextInt();
		int num2 = calc.nextInt();

		System.out.println("Please enter one of these operator: +, -, *, / ");
		char op=calc.next().charAt(0);

		int result=0;

		if (op=='+') {
			result = num1 + num2;
		} else if (op=='-') {
			result = num1 - num2;
		} else if (op=='*') {
			result = num1 * num2;
		} else if (op=='/') {
			result = num1 / num2;
		} else {
			System.out.println("Invalid entry");
		}

		System.out.println(result);
		
		
	}

}
