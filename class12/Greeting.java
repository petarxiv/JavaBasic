package class12;

public class Greeting {

	
	void sayHello(String name) { //Very important!!
		System.out.println("Hello "+name);
	}
	void sayHelloManyTimes(String name) {
		for (int i=0;i<5;i++) {
			System.out.println("Hello "+name);
		}
	}
	
	void sayHelloNumberofTimes(String name, int times) {
		for(int i=0;i<times; i++) {
			System.out.println("Hello "+name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting greeter=new Greeting();
		greeter.sayHelloNumberofTimes("Emili",10); //Tarik should be a String in order to save it under name
		
	}

}
