package class5;

import java.util.Scanner;

public class HM6 {

	public static void main(String[] args) {
      Scanner x=new Scanner(System.in);
      
      System.out.println("Which is your birth month?");
      String x1=x.nextLine();
      if(x1.equalsIgnoreCase("March") || x1.equalsIgnoreCase("April") || x1.equalsIgnoreCase("May")) {
    	  System.out.println("Spring");
      }else if(x1.equalsIgnoreCase("June") || x1.equalsIgnoreCase("July") || x1.equalsIgnoreCase("August")) {
	System.out.println("Summer");
	  }else if(x1.equalsIgnoreCase("September") || x1.equalsIgnoreCase("October") || x1.equalsIgnoreCase("November")) {
	System.out.println("Autumn");
	  }else if(x1.equalsIgnoreCase("December") || x1.equalsIgnoreCase("January") || x1.equalsIgnoreCase("February")) {
		  System.out.println("Winter");
}
}
}