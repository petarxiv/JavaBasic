package class4;

import java.util.Scanner;

public class Homework4 {
// You are DMV representative and you need to ask customer their age. If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
	public static void main(String[] args) {
		Scanner card=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		String type=card.nextLine();
		
		if(type.equalsIgnoreCase("yes")) {
		System.out.println("What is the balance of the card?");
		
		int balance=card.nextInt();
		if(balance>1000) {
			
			System.out.println("Pay off immediately");
		}else if(balance<1000) {
			System.out.println("You can spend more");
		}
		}else {
			System.out.println("I can offer you");
		}
	}
		
	}


