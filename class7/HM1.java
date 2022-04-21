package class7;

public class HM1 {

	public static void main(String[] args) {
		//Task1
		//Print numbers from 1 to 100 in 1 line with space
		for(int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		//Task2
		System.out.println(" ");
		System.out.println(" --------------- ");
		//Print numbers from 100 to 1
		for(int b=100; b>=1; b--) {
			System.out.print(b+" ");
		}
		//Task3
		//Print even numbers from 20 to 1 (2 ways)
		for(int d=20; d>=1; d=d-2) {
				System.out.println(d);
			}
		//OR
		for(int d=20; d>=1; d--) {
			if(d%2==0) {
				System.out.println(d+" ");
			}
		}
		//Task 4 - Print odd numbers between 20 and 50 (2 ways)
System.out.println(" -------------------- ");
		
for(int e=21; e<=49; e=e+2) {
	System.out.print(e+" ");
}
		//OR
		for(int f=21; f<=49; f=f+2) {
			if(f%2==0) {
				System.out.print(f);
			}
		}
	}
	}	


