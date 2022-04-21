package groupProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//Create a 2D array of integer values. Print the sum of all numbers.
		
		//Pseudo programming
		//1)Create the 2D array
		//2) Print the sum of all numbers
		
		
		//Create the 2D array
		int[][] array2D= {{10,10,10},{20,20,20},{30,30,30}};
	
		//print out the  elements of an array with out a loops
		//System.out.println(Arrays.toString(array2D));
		//3) sum all the elements of the array
		int sum=0;
		for(int x=0; x<array2D.length; x++) {
			System.out.println(Arrays.toString(array2D[x]));
		for(int y=0; y<array2D[x].length; y++) {
			sum=sum+array2D[x][y];
			
		}
		}
		
		System.out.println("Sum of Array elements is "+sum);
		
		
	}

}
