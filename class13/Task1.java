package class13;

public class Task1 {

	int parameters(int num1, int num2) {
		if(num1>num2) {
			return num1;
		}else{
			return num2;
		}
	}
	public static void main(String[] args) {
		//Create a method that will take 2 parameters as a numbers and prints which number is larger.

		Task1 obj=new Task1();
		System.out.println(obj.parameters(45,9)+" is the largest!");
	}

}
