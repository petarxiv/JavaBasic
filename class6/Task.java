package class6;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		/*
		 * Ask user to enter their country and capture it
		 * Once values are captured print which kanguage user speaks 
		 */
		Scanner x=new Scanner(System.in);
		System.out.println("Which country are you from?");
		String y=x.nextLine();
		String language=null;
		
		
		switch(y.toUpperCase()) {
		case "USA":
			language="English";
			break;
		case "BULGARIA":
			language="Bulgarian";
			break;
		case "Germany":
			language="German";
			break;
		default:
			language="Invalid";
			System.out.println("In "+y+" people speak "+language);
		}
		x.close();
		
		System.out.println("In "+y+" people speak "+language);
	}

}
