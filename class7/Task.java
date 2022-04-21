

 package class7;

public class Task {

	public static void main(String[] args) {
//Print numbers from 1 to 100 in 1 line with space
		int a=1;
		while (a<=100) {
			System.out.print(a+" ");
			a++;
		}
		//Print numbers from 100 to 1
		int b=100;
		while(b>1) {
			System.out.println(b);
			b--;
		}
		//Print even numbers from 20 to 100 
		int c=20;
		while(c<=100) {
			if(c%2==0) {
				System.out.println(c+" ");
			}
			c++;
		}
		//Print only odd numbers from 100 to 1
		int d=99;
		while(d>=1) {
				System.out.print(d+" ");
				d-=2;
			}
		}
	}


