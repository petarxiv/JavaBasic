package class5;

import java.util.Scanner;

public class HM3 {

	public static void main(String[] args) {
      Scanner x=new Scanner(System.in);
		
      System.out.println("Enter a number");
      int y=x.nextInt();
      
      if(y>=1 && y<=10) {
    	  System.out.println("The number is small");
      }else if(y>=11 && y<=100) {
    	  System.out.println("The number is medium");
      }else if(y>=101 && y<=1000) {
    	  System.out.println("The number is large");
      }
      
	}

}
