package class13;

public class MethodsDemo3Task {

	String returnTheSameName(String name, String animalName) {
		
if("Teyfur".equalsIgnoreCase(name) && "Horse".equalsIgnoreCase(animalName)) {
return "camel";
}else if("Horse".equals(animalName)) {
	return "Horse";
}else {
	return "I don't know";
}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a method that takes a person name and an animal name
		//if person is "Teyfur" and if animal is "Horse" it returns us "camel"

		MethodsDemo3Task obj=new MethodsDemo3Task();
		System.out.println(obj.returnTheSameName("Teyfur", "Horse"));
		System.out.println(obj.returnTheSameName("Tameer", "Horse"));
		System.out.println(obj.returnTheSameName("Tameer", "Monkey"));
		
		
	}

}
