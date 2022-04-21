package class10;

public class Task2 {

	public static void main(String[] args) {

		//Create an array of countries.While retrieving all values from an array print
		 //capital for each country.
		
		String[] countries= {"Poland", "Germany", "Ukraine", "Russia", "UK"};
		String capital = null;
		
		for(int i=0; i<countries.length; i++) {
			
			switch(countries[i]) {
			
			case "Polad":
				capital="Warsaw";
				break;
			case "Germany":
				capital="Berlin";
				break;
			case "Ukraine":
				capital="Kiev";
				break;
			case "Russia":
				capital="Moscow";
				break;
			case "UK":
				capital="London";
				break;
			}
			System.out.println("The capital of the country "+countries[i]+" is "+capital);
		}
		System.out.println(" ------- Another way --------- ");
		
		for (String country:countries) {
			if(country.equals("Poland")) {
				capital="Warsaw";
			}else if(country.equals("Germany")) {
				capital="Berlin";
			}else if(country.equals("Ukraine")) {
				capital="Kiev";
			}else if(country.equals("Russia")) {
				capital="Moscow";
			}else if(country.equals("UK")) {
				capital="London";
			}
			System.out.println("The capital of "+country+" is "+capital);
		}
	}

}
