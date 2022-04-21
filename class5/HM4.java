package class5;

import java.util.Scanner;

public class HM4 {

	public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
       System.out.println("What is the current time?");
       double y=x.nextDouble();
       
       if(y>=1.00 && y<=11.59) {
    	   System.out.println("It's morning");
       }else if(y>=12.00 && y<=15.59) {
    	   System.out.println("It's afternoon");
       }else if(y>=16.00 && y<=20.59) {
    	   System.out.println("It's evening");
       }else if(y>=21.00 && y<=24.00){
    	   System.out.println("It's night");
       }
	}
}
