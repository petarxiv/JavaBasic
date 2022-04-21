package class10;

import java.util.Scanner;

public class ProjectTask01 {

	public static void main(String[] args) {

		//Task 1
		//Create an array on int values using a scanner and calculate the sum of all stored elements in that array.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		
		int length=scan.nextInt();
		int [] arr=new int[length];
		
		System.out.println("Enter the elements of the array:");
		
		for(int i=0; i<length; i++) {
			arr[i]=scan.nextInt();
			
		}
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		System.out.println("The sum of all elements in the array is "+sum);
		
	}

}
