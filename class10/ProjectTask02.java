package class10;

public class ProjectTask02 {

	public static void main(String[] args) {

		//Task 2 from the Project
		//Create a 2D array of integer values. Print the sum of all numbers
		int [][] numbers= {
				{1,3,5,7},
				{2,4,6,8},
				{20,30,40,50},
		};
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				sum+=numbers[i][j];
			}
		}
		System.out.println(sum);
	}

}
