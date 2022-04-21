package class9;

public class ForEachLoop {

	public static void main(String[] args) {

		String[] cities= {"Washington DC", "Boston", "Miami", "Los Angeles", "New York"};
		
		//if you have an array you can use for each loop to iterate/loop through the entire array
		
		for(String city:cities) {
			System.out.println(city);
			
			
		}
		System.out.println(" ------------ ");
		
		
		int [] numbers= {10,20,30,40};
		for(int num:numbers) {
		System.out.println(num);
	}
		
		System.out.println(" ---------------- ");
		
		char[] grades= {'A', 'B', 'C', 'D'};
		for(char grade:grades) {
			System.out.println(grade);
		}
		
		String[] countries=new String[5];
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afganistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		
		for(String country:countries) {
			System.out.println(country);
		}
	}
	
}
