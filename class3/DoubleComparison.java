package class3;

public class DoubleComparison {

	public static void main(String[] args) {

		//Task 1
		double x=50.2;
		double y=25.2;
		if (x>y) {
			System.out.println("Double value "+x+" is larger than "+y);
		}else {
			System.out.println(80);
		}
		//Task 2
		//Temperature Check
		int temp=50;
		if (temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
			}else {
				System.out.println("Water will NOT freeze with temperature "+55);
			}
		//Task 3
		//Expected and Actual Hours
		double expectedhour=7.15;
		double actualhour=20.30;
		
		if(expectedhour>=actualhour) {
			System.out.println("You will love the course and you will succeed");
		}else {
			System.out.println("Course will be very hard for you!");
		}
	}

}
