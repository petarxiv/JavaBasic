package class10;

public class Task {

	public static void main(String[] args) {

		//create an array and retrieve all elements in reverse order
		
		int[] numbers= {2,4,7,8,14};
		
		
		for(int y=numbers.length-1; y>=0; y--) {
			System.out.println(numbers[y]+" ");
		}
		
		//OR
		int[] arr= {10,20,30,40,50,60};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
			for(int i=arr.length-1; i>=0; i--) { //i need to fix it
				System.out.println(arr[5]);
			}
			
			System.out.println(" another way");
		int[] arrs= {45,23,15,30};
		for (int i=0; i<arrs.length; i++) {
			System.out.print(arrs[arrs.length-i-1]+" ");
		}
	}

}
