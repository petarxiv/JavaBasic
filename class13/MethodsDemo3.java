package class13;

public class MethodsDemo3 {

	
	//int we specify the datatype that method will return
	//squareTheNumber name of the method 
	//(int number) parameters of the method 
	//return tell java what to return from this method 
	
	int squareTheNumber(int number) {
		
		return number*number;
	}
	
	int returnTheSameNumber(int number) {
		return number;
		
	}
	
	//create a method that takes a person name and an animal name
	//if person is "Teyfur" and if animal is "Horse" it returns us "camel"
	//break till 8:55
	
	
	public static void main(String[] args) {

		MethodsDemo3 obj=new MethodsDemo3(); //object creation
		int result=obj.returnTheSameNumber(5);
		System.out.println(result);
		
		
	}

}
