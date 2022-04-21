package class8;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		  int end=input.nextInt();

		  for(int x=0; x<end; x++) {
		    if(x==end*2){
		      break;
		    }
		    System.out.print(x+" ");
		  }
		}
		
	}

 
 