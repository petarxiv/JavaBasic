package class6;

import java.util.Scanner;

public class StoringIntoVariable {

	public static void main(String[] args) {

		  Scanner x=new Scanner(System.in);
	       System.out.println("Quiz score");
	       int x1=x.nextInt();
	       System.out.println("Mid term");
	       int x2=x.nextInt();
	       System.out.println("Final score");
	       int x3=x.nextInt();
	       int x4=((x1+x2+x3)/3);
	       System.out.println(x4);
	       
	       char grade;
			if(x4>=90) {
            grade='A';
            
			}else if(x4>=70 && x4<=90) {
            grade='B';
			}else if(x4>=50 && x4<70) {
            grade='C';
			}else {
            grade='F';
			}
			System.out.println("Your grade is "+grade);
			if(grade=='A' || grade=='B') {
				System.out.println("You are a great student");
			}
		}
		
	}


