package groupProjects;

import java.util.Arrays;

public class Class9 {

	public static void main(String[] args) {

		//Maximum and minimum number in the array?
		
				int[] arr= {10,20,30,90,70};
				//assuming first number is the largest number
				int largest=Integer.MIN_VALUE;
				int secondLargest=Integer.MIN_VALUE;
				
				
				//iterating through all the elements 
				for(int elements:arr) {
					if(elements>largest) {
						secondLargest=largest;
						largest=elements;
					}else if(elements>secondLargest && elements!=largest) {
						secondLargest=elements;
					}
					}
				System.out.println("Largest "+largest);
				
				
				// 2 Variation 
				
				int[] arr1= {10,20,90,50,70};
				Arrays.sort(arr);;
				System.out.println(arr1[arr1.length-1]);
				System.out.println(arr1[arr1.length-2]);
				}
	}

