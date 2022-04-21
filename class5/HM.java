package class5;

import java.util.Scanner;

public class HM {

	public static void main(String[] args) {

		Scanner height=new Scanner(System.in);
		
		System.out.println("What's your height (in inches) ?");
		int x=height.nextInt();
		
		if(x<60) {
			System.out.println("You are short");
		}else if(x>=60 && x<=72) {
			System.out.println("You are medium");
		}else {
			System.out.println("You are tall");
		}
		
	}

}
