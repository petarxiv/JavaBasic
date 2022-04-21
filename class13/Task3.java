package class13;

public class Task3 {

		//Create a method that will say Hello in different language based on the country 
		//that will passed when method is executed.

		void cl(String country) {
			if("Bulgaria".equals(country)) {
				System.out.println("Zdravei");
			}else if("US".equals(country)) {
				System.out.println("Hello");
			}else {
				System.out.println("Unknown");
			}
		}
			public static void main(String [] args) {
			Task3 obj=new Task3();
			obj.cl("Bulgaria");
			obj.cl("Japan");
			obj.cl("US");
	}
}
