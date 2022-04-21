package class2;

public class NonPrimitiveType {

	public static void main(String[] args) {

		String name="Aizhan";
		
		String lastName ="Abenova";
		
		long phoneNumber =9234567890l;
		
		String mobileNumber="123-456-7890";
		
		String num="123";
		
		int num1=123;
		
		String greeting="Hello Friends!";
		
		System.out.println(greeting);
		
		//syso+ctrl+space > autocomplete print statement
		
		System.out.println(name);
		System.out.println(lastName);
		
		System.out.println(name+" "+lastName);
		
		/* using + we can concatenate
		 *  String +String
		 *  String + int
		 *  String +bolean
		 *  String + double, char etc...
		 */
		
		int age=25;
		
		// Aizhan is 25 years old 
		
		System.out.println(name+" is "+age +" years old");
		
		String address="123 Test Street";
		
		//I live on 123 Test Street
		
		System.out.println("I live on "+address);
		
		String feeling ="like";
		
		String food ="kebab";
				
				// I like kebab
				
				System.out.println("I "+feeling+" "+food);
				
				feeling="love";
				food="shrimp";
				
				System.out.println("I "+feeling+" "+food);
		

		
	}

}
