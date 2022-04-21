package class12;

public class Dogg {
	//Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
	//attributes
	String furColor;
	String eyeColor;
	int age;
	char gender;
	//behaviors
	void run() {
		System.out.println("Dog is running...");
	}
	void eating() {
		System.out.println("Dog is eating");
	}
	void play() {
		System.out.println("Dog is playing");
	}

	public static void main(String[] args) {
		//objects
		Dogg Husky=new Dogg();
		Dogg Bulldog=new Dogg();
		Dogg Labrador=new Dogg();
		
		Husky.run();
		Bulldog.eating();
		Labrador.play();
	}
}
