package class5;

public class LogicalAnd {

	public static void main(String[] args) {

		boolean likeJava=false;
		boolean undestandJava=false;
		
		
		if(likeJava && undestandJava) {
			
			System.out.println("This is best combination");
		}
		System.out.println("End of the code");
		
		//we want to compare 3 numbers and find the largest
		/*
		 * if    num1> num2 && num1> num3 > num1 is the largest
		 * what if   num2 > num1 &&  num2 > num3 > num2 is the largest 
		 * what if num3>num1 && num3>num2 > num3 is the largest 
		 * 
		 * */
		
		int num1=100;
		int num2=2000;
		int num3=300;
		
		if (num1>=num2 && num1>num3) {
		System.out.println(num1+" is the largest");
		
		}else if (num2>num1 && num2>num3) {
			System.out.println(num2+" is the largest");

		}else if (num3>num1 && num3>num2) {
			System.out.println(num3+" is the largest");
		}
		
	}

}
