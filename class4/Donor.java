package class4;

public class Donor {

	public static void main(String[] args) {

		int age=21;
		
		if(age>=18) {
			System.out.println("Eligible to donate blood");
			
			int weight=150;
			
			if(weight>=110) {
				System.out.println("You can be a donor");
			}else {
				System.out.println("Cannot accept such a patient");
			}
			
			
		}else {
			System.out.println("Not eligible to donate blood");
		}
	}

}
