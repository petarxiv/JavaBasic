package class10;

public class ProjectTask07 {

	public static void main(String[] args) {

		//Task 7 from the Project
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int num=10;
		
		int first=0;
		int second=1;
		
		for(int i=0; i<num; i++) {
			if(i==0) {
				System.out.print("0 ");
			}
			else if(i==0) {
				System.out.println("1 ");
			}else {
				int sum=first+second;
				System.out.print(sum+" ");
				first=second;
				second=sum;
			}
		}
	}

}
