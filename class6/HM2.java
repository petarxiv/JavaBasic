package class6;

import java.util.Scanner;

public class HM2 {

	public static void main(String[] args) {
//Scanner scan=new Scanner(System.in);

//HW:  Using scanner class create calculator. 
//Allow user to enter 2 numbers and operator(+,-,*,/). 
//Based on operator provide the result to user.
		Scanner input=new Scanner(System.in);
		System.out.println("Plese enter two numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("Please enter operator (+,-,*,/)");
		String operator=input.next();
		int num=0;
if(operator.equals("+")) {
	System.out.println("Your results = " +(num=num1+num2));
}else if(operator.equals("-")) {
	System.out.println("Your results = " +(num=num1-num2));
}else if(operator.equals("*")) {
	System.out.println("Your results = " +(num=num1*num2));
}else if(operator.equals("/")) {
	System.out.println("Your results = " +(num=num1/num2));
	}
	}
}
