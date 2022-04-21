package class4;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		
		Scanner number=new Scanner(System.in);
		System.out.println("How many years have you worked?");
		int years=number.nextInt();
		System.out.println("What was your annual salary?");
		int salary=number.nextInt();
		if(years>=5) {
			System.out.println("You are eligible for the bonus");
		if(salary>50000) {
			System.out.println("Your bonus will be 5000");
		}else if(salary<50000)
			System.out.println("Your bonus will be 3000");
		} else {
			System.out.println("You are not eligible for the bonus");
		}
	}
	}

