package class4;
import java.util.Scanner;
public class Homework6 {
	public static void main(String[] args) {
		//Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)
		Scanner number=new Scanner(System.in);
        System.out.println("Please enter 3 different numbers");		
		int num=number.nextInt();
		int num2=number.nextInt();
		int num3=number.nextInt();
		
		
		if(num>num2){
		    if(num>num3){
		        // num1 largest
		        System.out.println(num+" is the largest");
		    }
		} else if(num2>num3) {
		    // num2 is largest
		    System.out.println(num2+" is the largest");
		} else {
		    // num3 is the largest
		    System.out.println(num3+" is the largest");
		}
		}
	}

