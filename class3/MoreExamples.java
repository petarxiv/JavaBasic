package class3;

public class MoreExamples {

	public static void main(String[] args) {

		
		/*
		 * 
		 * We need to declare a boolean variable hungry yes or no
		 * If we are hungry ? O a, going to eat
		 * otherwise > I am going to drink a tea
		 * 
		 */
		boolean hungry=false;
		if(hungry) {
			
		System.out.println("I am going to eat");
		
		}else {
			System.out.println("I am going to drink a tea");
		}
		
		boolean traffic=true;
		
		if(traffic) {
			System.out.println("I am coming home late");
		}else {
			System.out.println("No traffi, I am on time");
		}
			
		/*
		 * define a variable to store a browser 
		 * 
		 * If browser is chrome > we are executing tests on chrome 
		 * otherwise > I am not execiting any test cases
		 * 
		 */
		
		String browser="chrome";
		
		//always use equals to compare 2 strings
		if (browser.equals("chrome")) { 
			System.out.println("We are executing tests on chrome");
		}else {
			System.out.println("We are not executing any test cases");
		}
		
		/*
		 * if (browser) { }/Type mismatch: cannot convert from String to boolean 
		 */
	}
}
