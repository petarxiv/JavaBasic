package class9;

public class Recap {

	public static void main(String[] args) {

		for (int i=4; i<=4; i++) {
			
			System.out.println("a");
			//break;
			System.out.println("B");
		}
		System.out.println(" ----------------- ");
		for (int i=1; i<=3; i++) { //outer loops controls number of iteration of inner loop
			
			for (int j=1; j<=3; j++) { // inner loops always depends on outer
			System.out.println("Hello");
			break;
		}
		System.out.println("Good Morning");
		break;
	}
		System.out.println(" ---------------- ");
		for (int i=0; i<=3; i++) {
			
			
			for (int b=1; b<+4; b++) {
				System.out.println("Good Morning");
				continue;
			}
			System.out.println("Hello");
		}
}
}
