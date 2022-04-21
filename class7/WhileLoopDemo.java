package class7;

public class WhileLoopDemo {

	public static void main(String[] args) {

		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println("The value of i outside of while loop = "+i);
		
		//I need to print values from 2 to 20
		
		
		
		int a=2;
		while(a<=20) {
			System.out.println(a);
			a++;
		}
		
		
		int b=1;
		while(b<=50) {
			System.out.print(b+" ");
			b++;
			
		}
		
		
		System.out.println(" -- I need numbers from 20 to 1");
		
		int c=20;
		while(c<=1) {
			System.out.print(c+" ");
			c--;
		}
		
		
		System.out.println("The End");
		
		//TASK
		System.out.println(" Print only even numbers from 1 to 30  ");
		
		int d=2;
		while(d<=30) {
			System.out.print(d+" ");
			d+=2; //d=d+2;
		}
		
		System.out.println("another way to print even numbers from 1 to 30");
		
		int e=1;
		while(e<=30) {
			if(e%2==0) {
			System.out.print(e+" ");
			}
			e++;
	}

}
}
