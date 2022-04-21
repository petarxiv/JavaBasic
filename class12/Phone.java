package class12;

public class Phone {

	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Nokia with specific  attributes and behaviors.
	//attributes
	String color;
	String processor;
	int year;
	//behaviors
	void ring() {
		System.out.println("Phone is ringing...");
	}
	void vibrate() {
		System.out.println("Phone is vibrating");
	}
	void makeNoise() {
		System.out.println("Phone is making noise");
	}
	public static void main(String[] args) {
		//objects
		Phone iPhone=new Phone();
		iPhone.color="Gold";
		iPhone.processor="i7";
		iPhone.year=2021;
		iPhone.vibrate();
		iPhone.makeNoise();
		
		Phone Pixel=new Phone();
		Pixel.color="Silver";
		Pixel.processor="i9";
		Pixel.year=2019;
		Pixel.vibrate();
		Pixel.makeNoise();
		
		
		Phone Nokia=new Phone();
		Nokia.color="Black";
		Nokia.processor="i2";
		Nokia.year=2015;
		Nokia.vibrate();
		Nokia.makeNoise();
		
	}
}
