package class5;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		/* let's ask user what is today day
		 * 
		 * based on the day lets define which class we have
		 * 
		 * if(Monday or Friday) > there is no class 
		 * else if (tuesday or wednesday) > manual 
		 * else if (thursday) >> review class 
		 * else if (saturday or sunday) >> java class 
		 * 
		 */
		
Scanner testing=new Scanner (System.in); 
		
		System.out.println("what is the day today");
		String date= testing.nextLine();
		
		
		if (date.equalsIgnoreCase("monday") || date.equalsIgnoreCase("friday")) {
			System.out.println("I dont have class today");
		}
		else if (date.equalsIgnoreCase("Tuesday")|| date.equalsIgnoreCase("Wednesday"))	{
			System.out.println("I hava manual class today ");
		}
		else if (date.equalsIgnoreCase("thursday"))	
				{
			System.out.println("I have review day today");
				}
		
		else if (date.equalsIgnoreCase("Saturday")|| date.equalsIgnoreCase("Sunday"))	{
			System.out.println("I hava java class today ");
		}
		
		else {
		System.out.println("error");
		}
		
		
	}

}
