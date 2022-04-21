package class5;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {

		
		//next() vs nextLine();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter temperature");
		
		int temp=scan.nextInt(); //nextInt(); nextDouble(); nextBoolean(); next().charAt(0);
		
		System.out.println(temp);
		
		scan.nextLine();
		
		System.out.println("Please enter City");
		
		String anotherValue=scan.nextLine();
		
		System.out.println(anotherValue);
		
		System.out.println("End of program");
	}

}
