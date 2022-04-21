package class10;

public class HM4 {

	public static void main(String[] args) {

		//From an array of int elements find the largest number
		int[] number= {15,45,10,32};
		
		
		int largest=number[0];
		for(int n=0;n<number.length; n++) {
			if(number[n]>largest) {
				largest=number[n];
			}
		}
		System.out.println(largest);
		//--------------
		largest=number[0];
		for(int num:number) {
			if(num>largest) {
				largest=num;
			}
		}
		System.out.println(largest);
	}

}
