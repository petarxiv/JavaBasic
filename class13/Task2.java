package class13;

public class Task2 {

		//Task 2 Homework
		//Create a method that will take a number and prints whether the number is even or odd.
	   void checkEvenOdd(int num) {
	   	 if(num%2==0) {
	   		 System.out.println("The number is even!");
	   	 }else {
	   		 System.out.println("The number is odd!");
	   	 }
	   }
		public static void main(String[] args) {
			Task2 obj=new Task2();
			obj.checkEvenOdd(4);
		}
	}


