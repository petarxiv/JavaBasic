package class10;

public class AllValuesFrom2Darray {
public static void main(String[] args) {
	
	int[][] numbers= {
			{10,20,30},
			{100,200,300,400},
			{1000,2000}
	};
	//Retrieving all elements from 2D array
	
	for(int i=0; i<numbers.length; i++) {
		
		for(int j=0; j<numbers[i].length; j++) {
			
			System.out.println(numbers[i][j]);
			
			
			
		}
	}
	//numbers.length>gives # of rows
		int size=numbers.length;//when used with 2D array gives # of 1D Arrays that we stored
		
		System.out.println(size); //3
		
		int sizeof1Array=numbers[0].length;
		System.out.println("Size of first array = "+sizeof1Array); //4
		
		int sizeof2Array=numbers[1].length;
		System.out.println("Size of second array = "+sizeof2Array);
		
		int sizeof3Array=numbers[2].length;
		System.out.println("Size of third array = "+sizeof3Array);
}
}
