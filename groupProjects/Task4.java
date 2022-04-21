package groupProjects;

public class Task4 {

	public static void main(String[] args) {

		//Create a 2D array of integers.
		//Develop a program which will calculate the sum of even and odd numbers for that array
		
		/*
		 * Create a 2D array of integer type where you will store odd and even numbers
		 * Develop a program which will identify/print the even numbers only
		 */
		
		//1)Create the 2D array
		//2)Store Even and odd numbers in the 2D array
		//Access the elements 
		//Check the if element is even if it is add it to sumEven variable 
		//Check the if element is odd if it is add it to oddEven variable
		//print the value of both variable
		
		
		int[][] array2D= {
				{2,3,4},
				{5,6},
				{12,6,8} };
		
		int sumEven=0;
		int sumOdd=0;
		
		for (int[] row : array2D) {
			for (int element : row) {
				if (element % 2 == 0) {
					sumEven += element;
				} else {
					sumOdd += element;
				}
			}
		
		
		}
	System.out.println("Sum of Even numbers "+sumEven);
	System.out.println("Sum of Odd numbers "+sumOdd);
	}

}
