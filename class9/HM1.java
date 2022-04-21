package class9;

public class HM1 {

	public static void main(String[] args) {

		//Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.
		//Task 1
		String[] cars= {"Toyota", "Mercedes", "Tesla", "Nissan", "Audi"};
		for (String car:cars) {
			System.out.print(car+" ");
		}
		//OR
		System.out.println(" ----- OR ------- ");
		String[] cars1=new String[5];
		cars1[0]="Toyota";
		cars1[1]="Mercedes";
		cars1[2]="Tesla";
		cars1[3]="Nissan";
		cars1[4]="Audi";
		System.out.print(cars1[0]+" "+cars1[1]+" "+cars[2]+" "+cars1[3]+" "+cars1[4]);
		
		//OR
		String[] cars3= {"Toyota", "Mercedes", "Tesla", "Nissan", "Audi"};
		for (int i=0;i<=cars3.length; i++) {
			System.out.println(cars3[i]+" ");
		}
		
		System.out.println(" ------- Task 2 ------ ");
		
		//Create an array of animals and store 5 elements into it.
		//Using 2 different loops print all elements from the array.
		//Task 2
		String[] animals= {"lion", "elephant", "dog", "cat", "mouse"};
		for (String animals1:animals) {
			System.out.print(animals1+" ");
		}
		System.out.println(" ----- OR ------- ");
		String[] animals2=new String[5];
		animals2[0]="lion";
		animals2[1]="alephant";
		animals2[2]="dog";
		animals2[3]="cat";
		animals2[4]="mouse";
		System.out.print(animals2[0]+" "+animals2[1]+" "+animals2[2]+" "+animals2[3]+" "+animals2[4]);
		
		//Create an array on integers and calculate the sum of all elements in an array
		//Task 3
		System.out.println(" ------ Task 3 ------ ");
		int[] numbers= {1,2,3,4,5,6};
		int sum=(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]+numbers[5]);
		System.out.println(sum);
		
		//From an array of integer elements find the largest number.
		int max=0;
		int[] num= {1,5,7,9,25,46};
		for(int a=0; a<num.length; a++) {
			if(num[a]>max) {
				max=num[a];
			}
		}
		System.out.println(max);
	}

}
