package class15;

public class StringDemo3 {

	public static void main(String[] args) {

		String name="How @you @guys Camel"; //every letter and space is an index
		
		System.out.println(name.indexOf("@"));
		System.out.println(name.indexOf("Horse"));
		
		//advance we can ignore if from now
		System.out.println(name.indexOf("@",8+1)); // ignores searching from 9 and search from letter index 9
		System.out.println(name.indexOf("@", name.indexOf("@")+1));
	}

}
