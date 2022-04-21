package class9;

public class Task1 {

	public static void main(String[] args) {

		//Create an array of chars and store grades into it: A,B,C,D,E,F.
		//Then print a grade B (use 2 different ways of creating an array).
		
		//Task 1
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]);
		
		//OR
		char[] grade1= {'A', 'B', 'C', 'D'};
		
		//how many elements inside array?
		int size=grade1.length;
		
		System.out.println("Number of elements is = "+size);
		
		System.out.println(grade1[1]);
		
		for(int i=0; i<grade.length; i++) {
			System.out.println(grade[i]+"  ");
		}
		
		//Task 2
		
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		// -------------------
		
		String[] cities= {"Washington DC", "Boston", "Miami", "Los Angeles", "New York"};
		// if value is Miami > I want to leave in Miami
		
		for(int a=0; a<cities.length; a++) {
			System.out.print(cities[a]+"   ");
			
			if(cities[a].equals("Miami")) {
			System.out.println("I want to leave in Miami");
			
		}
	}
	}
}
