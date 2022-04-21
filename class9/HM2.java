package class9;

public class HM2 {

	public static void main(String[] args) {

		
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names= {"Ivan", "Petar", "Emil", "George"};
		System.out.println(names[1]);
		//OR
		System.out.println(" ------ OR ------- ");
		String[] name=new String[3];
		name[0]="Ivan";
		name[1]="Petar";
		name[2]="Emil";
			System.out.println(name[1]);
			System.out.println(" ------ OR ------- ");
			//Task 2
			//Create an array of words: Java, Saturday, day, coding, is. 
			//Print the following sentence using elements of array: “Saturday is Java coding Day”. 
			String[] words= {"Java", "Saturday", "day", "coding", "is"};
System.out.println(words[1]+" "+words[4]+" "+words[1]+" "+words[3]+" "+words[2]);

					
			}
	}


