package class13;

public class Task5 {

	//Write a method to return whether given number is prime or not?
	String isPrime(int num) {
		if(num>1) {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return num+" is not a prime number";
				}
			}
		}else {
			return num+" is not a prime number";
		}
		return num+" is prime number";
	}
	
	public static void main(String[] args) {
		
		Task5 primeNumber=new Task5();
		System.out.println(primeNumber.isPrime(7));
		System.out.println(primeNumber.isPrime(8));
	}
}
