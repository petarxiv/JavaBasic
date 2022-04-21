package class14;

public class Task3 {

	String sayHello(String country) {
		
		country=country.toLowerCase(); // VERY IMPORTANT
		String returnedCountry="";
		
		
		switch(country) {
		case"USA":
			returnedCountry="Hello";
			break;
		case "France":
			returnedCountry="Bonjour";
			break;
		case "turkey":
			returnedCountry="Merhaba";
			break;
			default:
				returnedCountry="Petar is very good and patience student who loves kaka Krisi";
		}
		return returnedCountry;
	}
	
	
	public static void main(String[] args) {

		/*
		 * Create a method that will say Hello in different language based on the country that will 
		 * passed when method is executed
		 */
		
		Task3 obj=new Task3();
		String country=obj.sayHello("USA");
		System.out.println(country);
	}

}
