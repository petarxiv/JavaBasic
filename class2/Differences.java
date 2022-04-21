package class2;

public class Differences {

	public static void main(String[] args) {

		String a="Hello";
		String b="Bye";
		
		int c=10;
		int d=20;
		
		System.out.println(c+d+a+b); //30HelloBye
		System.out.println(a+b+c+d); //HelloBye1020
		System.out.println(a+b+(c+d)); //HelloBye30
		
		int num=123;
		String num2="123";
		
		String what=num+num2;
		System.out.println(what); //1231132
		
		System.out.println(num+num2); //123123
		
		
				
		
	}

}
