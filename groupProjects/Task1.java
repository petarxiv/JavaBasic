package groupProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create an array on int values using a scanner and calculate the sum
		 * of all stored elements in that array
		 */
		
		//Pseudo programming
		//1)Take the size of the Array using scanner class from the user
		//2)create an int array of above size
		//3)fill the array with elements from the user using scanner class 
		//4)sum all the elements of the array 
		//5)A class that helps use take the input from the keyboard
		
		Scanner scanner=new Scanner(System.in);
		//prompt the user for the size
		System.out.println("Please Enter the size of the array");
		//take the size from the usr and store it in size variable 
		int size=scanner.nextInt();
		//print out the size 
		System.out.println("Size of the Array "+size);
		//2)create an int array of above size
		int[] array=new int[size];
		//fill the array with elements from the user using scanner class 
		System.out.println("Please enter "+size+" element");
		for(int i=0; i<size;i++) {
			System.out.println("Please enter the element for index "+i);
			array[i]=scanner.nextInt();
			
		}
		//print out the  elements of an array with out a loops
		System.out.println(Arrays.toString(array)); //learn this one!!!!
		//4) sum all the elements of the array
		int sum=0;
		for(int x=0; x<size; x++) {
			sum=sum+array[x];
			//sum+=array[x]
		}
		System.out.println("Sum of Array elements is "+sum);
		
		

	}

}
