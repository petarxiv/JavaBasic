package class6;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		//Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		//At the end your program should print which grade was entered by a user with explanation.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade=scan.next().charAt(0);
		String rate;
		
		switch (grade) {
			case'A':
				rate="Excellent";
				break;
			case'B':
				rate="Good";
				break;
			case'C':
				rate="Average";
				break;
			case'D':
				rate="Bad";
				break;
				default:
					rate="Not Acceptable";
		}
		System.out.println("rate");
		
	}

}
