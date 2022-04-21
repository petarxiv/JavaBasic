package class6;

import java.util.Scanner;

public class HomeworkPractice {

	public static void main(String[] args) {

Scanner day=new Scanner(System.in); 

		System.out.println("Please enter numerical value of today's day.");
		int whatDay= day.nextInt();
		
		if (whatDay>=1 && whatDay<=5) {
			System.out.println("It is a weekday.");
		}
		else if (whatDay==7 || whatDay==6) {
			System.out.println("It is weekend.");
		}
		else {
			System.out.println("Invalid day");
		}
	}

}
