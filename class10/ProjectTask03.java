package class10;

public class ProjectTask03 {

	public static void main(String[] args) {
		

		//Task 3 from Project
		//Create a 2D array or integer type where you will store odd and even numbers. 
		//Develop a program which will identify/print the even numbers only.
		
	int[][] num= {
				{3,6,9,12,15,18},
				{2,4,6,8,10,12}
		};
		
		for(int x=0; x<num.length; x++) {
			for(int y=0; y<num[x].length;y++)
			if(num[x][y]%2==0){
				System.out.println(num[x][y]);
			}
		}
	}
}
