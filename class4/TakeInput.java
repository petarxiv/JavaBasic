package class4;

/*
 * to import in mac: cmd+shift+0
 * to import in windows: ctrl+shift+0
 */

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		
		//1. create a Scanner and assign to a variable
		
		Scanner scan=new Scanner(System.in); //First write down this> =new Scanner(System.in); > and then the rest
		
		//2. specify instructions
		
		System.out.println("Please enter the country where are you from");
		
		//3. we need to capture String value > use next();
		
		String country=scan.next();
		System.out.println("You are from "+country);
		
		//if you are from USA > you speak English
		// if you are from France > you speak French
		
		if(country.equalsIgnoreCase("USA")) {
			System.out.println("You speak english");
			
		}else if(country.equalsIgnoreCase("France")) {  //when you type equalsIgnoreCase > it ignores the capital letters
			System.out.println("You speak french");
			
		}else if(country.equalsIgnoreCase("Turkey")) {
			System.out.println("You speak turkish");
			
		} else {
			System.out.println("I don't know which language you speak");
		}
		
		
	}
	
}
