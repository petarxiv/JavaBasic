package class13;


public class MethodsDemo2 {
	//create a method that takes an animal name and person name if name is equal to Teyfur and animal is Horse
	//print camel otherwise print horse
	void TeyfurAndHorse(String personName, String animalName) {
		if("Teyfur".equals(personName) && "Horse".equals(animalName)) {
			System.out.println("This is camel");
		}else {
			System.out.println("This is horse");
		}
	}
	
	
	
		public static void main(String [] args) {
		MethodsDemo2 object2=new MethodsDemo2();
		object2.TeyfurAndHorse("Teyfur","Horse");
		object2.TeyfurAndHorse("Tarik","Horse");
	}
	
		
		
}
	
	

	

