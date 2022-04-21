package class10;

public class ProjectTask9 {

	public static void main(String[] args) {

		//Task 9 of the Project
		//Write a java program to find the second largest number in the array
		int[] numbers= {80,10,15,80,60,20,30,40};
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<numbers.length; i++) {
			if(numbers[i]>largest) {
				secondLargest=largest;
				largest=numbers[i];
			}else if(numbers[i]>secondLargest && numbers[i]<largest) {
				secondLargest=numbers[i];
			}
		}
		System.out.println("The second largest number in the array is "+secondLargest);
	}

}
