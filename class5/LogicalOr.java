package class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		String day="Saturday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
		
				
				System.out.println("I have java class");
	}
		
		System.out.println("Code outside of if statement");
		
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
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("what is today day?");
		
		
}

}