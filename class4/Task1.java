package class4;

public class Task1 {

	public static void main(String[] args) {

		//Task 1
		/*
		 * Write a program to store a boolean value of whether user has diploma or not. If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. Then if user has a degree program should check a gpa score. If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .
		 */
		
		boolean diploma=true;
		
		
		if(diploma) {
			System.out.println("Congratulations!");
			
			double gpa=3.1;
			if(gpa>3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
			
		}else {
			System.out.println("Get a degree!");
		
		}
		
		//Task 2
		/*Write a program to store a boolean value of whether user has diploma or not. If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. Then if user has a degree program should check a gpa score. If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .
		 * 
		 */
		
		double mortgageRate=3.5;
		double mortgageprice=14500;
		
		if(mortgageRate>4.5 ) {
			System.out.println("Will not buy the house");
		}else {
			
			System.out.println("Consider buying");
			
			
			if (mortgageprice>5000) {
				System.out.println("You should take a loan");
			}else {
					System.out.println("You can pay cash");
				}
			}
		
		//Task 3
		
		
		
		
		}
	}
	


