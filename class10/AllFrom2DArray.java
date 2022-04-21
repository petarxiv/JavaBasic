package class10;

public class AllFrom2DArray {

	public static void main(String[] args) {

		String[][] food= {
				
				{"redbull","burger", "steak", "fries"},
				{"curry", "biriyani", "butter chicken"},
				{"noodles", "pad thai", "tom yum"},
				{"pizza", "pasta"}
				
		};
		System.out.println(" ALL VALUES FROM 2D ARRAY USING FOR EACH LOOP   ");
		
		//piuter loops over each array inside 2D ARRAY
		
		
		for(String[] cousine:food)
			//inner loop over each element from selected array
		for(String f:cousine) {
			
			System.out.println(f+" ");
		}
		System.out.println();
		
		
		
		//iterates over every array/row
		for(int row=0; row<food.length; row++) {
			
			//iterate over every colum of specified row 
			
			for(int col=0; col<food[row].length; col++) {
				
				//accessing elements
				System.out.println(food[row][col]);
			}
			
			
		}
		
	}

}
