package class4;

import java.util.Scanner;

public class Training {

	public static void main(String[] args) {

		Scanner personel = new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");

		  char gender = personel.next().charAt(0);

		System.out.println("Please enter your age");
		int age = personel.nextInt();
		if("gender"=="F") {
		  if(age>25){
		    System.out.println("Woman");
		  }else{
		    System.out.println("Girl");
		  }
		}else{
		  if(age>25){
		    System.out.println("Man");
		  }else{
		    System.out.println("Boy");
		  }
		}
		    }
		}