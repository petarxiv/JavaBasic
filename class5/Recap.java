package class5;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name="Asel";
		//String name=input.next();
		
		System.out.println("Please enter your age");
		
		int age=input.nextInt();
		
		System.out.println("Your name is "+name+" and your age is "+age);

		System.out.println("Please enter boolean value");
		
		boolean booleanValue=input.nextBoolean();
		
		System.out.println(booleanValue);
		
		System.out.println("Please enter decimal value");
		
		double d=input.nextDouble();
		
		System.out.println(d);
		
		System.out.println("Please enter char value");
		
		char c=input.next().charAt(0);
		
		System.out.println(c);
	}

}
