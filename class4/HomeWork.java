package class4;

public class HomeWork {

	public static void main(String[] args) {

		/*
		 * Write a program to check whether number is positive or negative
		 */
		
		int num = -9;
		if (num < 0) {
			System.out.println("The number "+ num + " is Negative");
		} else if (num>0){
			System.out.println("The number " + num + " is Positive");
		}else {
			System.out.println("The number is "+num);
		}
		
		/*
		 * Write a Java Program to check whether number is Even or Odd
		 */
		
		num=10;
		if (num % 2 ==0)
		System.out.println("This "+num+" is an even Number");
	else {
		System.out.println("The "+num+" is an Odd Number");
	}
	}
}
