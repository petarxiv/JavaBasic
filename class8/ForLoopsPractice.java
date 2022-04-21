package class8;

public class ForLoopsPractice {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			
			
			System.out.println("Hello "+i);
		}
		System.out.println(" MULTIPLICATION TABLE ");
		
		/*
		 * 3X1=3
		 * 3X2=6
		 * 3X3=9
		 * 3X10=30
		 */
		
		int num=7;
		int result;
		for (int i=1; i<=10; i++) {
			result=num*i;
			System.out.println(num+" X "+i+" = "+result);
		}
		System.out.println(" - WHAT IS THE OUTPUT- ");
		for(int i=0; i<=10; i+=3) {
			System.out.println(i+" ");
		}
		
		System.out.println(" -WHAT IS THE OUTPUT- ");
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum+=i; //sum=sum+i
		}
		System.out.println(sum);
		
		System.out.println(" -WHAT IS THE OUTPUT- ");
		int value=1;
		for(int i=1; i<4; i++) {
			value*=i; //sum=sum+i
		}
		System.out.println(value);
		
		
		/*
		 *  I want to find out the sum of all even and all odd numbers from the range 1 to 50
		 */
		//IMPORTANT!!!!!!
		int sumEven=0;
		int sumOdd=0;
		
		for(int sum2=1; sum2<=50; sum2++) {
			if(sum2%2==0){
			sumEven=sumEven+sum2;
			
			}else {
				sumOdd=sumOdd+sum2;
		}
		}
		System.out.println("The sum of all even numbers = "+sumEven+" and the sum of all odd numers is "+sumOdd);
		
		
		
		
		
		
		
		
		System.out.println(" ------------------ ");
		
		int s=0;
		for(int sum3=1; sum3<=50; sum3=sum3+2) {
			s=s+sum3;
		}
		System.out.println(s);
}
}
