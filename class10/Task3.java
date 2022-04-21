package class10;

public class Task3 {

	public static void main(String[] args) {

		//Task 1
		//Create a 2D array (longer way)where you will store the following values: 
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print following String:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String[][] names= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"},
		};
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][2]);
		
		// --------- OR ----------
		
		//String [][] new=String[][]....
		
		//Task 2
		//Create a 2D array(shorter way) in which first array will consist of 4 names 
		//and second array will contain grades.
		//Then your program should print name of the students that has A and B grade
		
		String[][] name= {
				{"Alex", "George", "Michael", "Mike"},
				{"A", "B", "C", "D"},
		};
		System.out.println(name[0][0]+" has "+name[1][0]+" grade.");
		System.out.println(name[0][1]+" has "+name[1][1]+" grade.");
	}

}
