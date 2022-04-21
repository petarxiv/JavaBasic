package class10;

public class ProjectTask04 {

	public static void main(String[] args) {

		//Task 4 from Project\
		//Create a 2D array of integers.
		//Develop a program which will calculate the sum of  even and odd numbers for that array.
		int nums[][]= {
				{2,4,6,5,8,7},
				{13,21,37,19,62,69},
		};
		int sumEven=0;
		int sumOdd=0;
		
		for(int x=0; x<nums.length;x++) {
			for(int y=0; y<nums[x].length;y++) {
				if(nums[x][y]%2==0) {
					sumEven=sumEven+nums[x][y];
				}else {
					sumOdd=sumOdd+nums[x][y];
				}
			}
		}
		System.out.println("The sum of even numbers is = "+sumEven);
		System.out.println("The sum of odd numbers is = "+sumOdd);
	}
}
