package class2;

public class DecimalValues {

	public static void main(String[] args) {
		
		/*
		 *  shortcut to format code:
		 *  
		 *  mac cmd+shift+f
		 *  windows ctrl+shift+f
		 * 
		 */
		
		// Task 1
		double a1=100;
		double a2=3;
		
		double sum=a1+a2;
		double sub=a1-a2;
		double div=a1/a2;
		double mul=a1*a2;
				
		System.out.println("The"+" "+"summary"+" "+"of 2 numbers"+" "+a1+" "+"and"+" "+a2+" "+"is equal to"+" "+sum);
		System.out.println("The"+" "+"subract"+" "+"of 2 numbers"+" "+a1+" "+"and"+" "+a2+" "+"is equal to"+" "+sub);
		System.out.println("The"+" "+"divide"+" "+"of 2 numbers"+" "+a1+" "+"and"+" "+a2+" "+"is equal to"+" "+div);
		System.out.println("The"+" "+"multiply"+" "+"of 2 numbers"+" "+a1+" "+"and"+" "+a2+" "+"is equal to"+" "+mul);
		
		// Task 2
		double a3=3.9d;
		double square=a3*a3;
		System.out.println("The square of the "+a3+" is "+square);
		
		// Task 3
		
		/*
		 * Write a program to print the area and perimeter of a rectangle with width = 5
		 * and height = 8. Your program should say. “The perimeter of a rectangle with
		 * width ___ and height ____ is equal to _____ and the area is __”
		 * 
		 */
		
		int width=5;
		int height=8;
		
		int perimeter = 2 * (width + height);
		int area = width * height;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + perimeter + " and the area is " + area);
		
	
		
	}

}
