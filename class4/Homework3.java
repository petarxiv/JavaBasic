package class4;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		Scanner city=new Scanner(System.in);
		
		System.out.println("Type a city");
		
		String name=city.nextLine();
		
		System.out.println("Type a temperature");
		
		double number=city.nextDouble();
		
		double conv=(number*1.8)+32;
		
		System.out.println("The temperature in the city "+name+" is "+conv);
	}

}
