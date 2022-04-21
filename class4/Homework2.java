package class4;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
      //You are DMV representative and you need to ask customer their age. If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
		
		
		Scanner age=new Scanner(System.in);
		System.out.println("What is your age?");
		
		int number=age.nextInt();
		
		if(number>=18) {
			System.out.println("I will be able to issue a driving license");
		} else {
			System.out.println("I won't be able to issue a driving license");
		}
		
	}

}
