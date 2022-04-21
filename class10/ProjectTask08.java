package class10;

public class ProjectTask08 {

	public static void main(String[] args) {

		//Task 8 of the Project
		//Maximum and minimum number in the array?
		int nums[]= {12,30,10,2,89,14};
		
		int min=nums[0];
		int max=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println("The minimim number is "+min+" and the naximim number is "+max);
	}

}
