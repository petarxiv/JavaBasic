package class5;

import java.util.Scanner;

public class Issue {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("Using next");
		
		String value=scan.next(); //nextInt(); nextDouble(); nextBoolean(); next().charAt(0);
		
		System.out.println(value);
		
		
		System.out.println("Using nextLine");
		
		String anotherValue=scan.nextLine();
		
		System.out.println(anotherValue);
		
		System.out.println("End of program");
	}

}
