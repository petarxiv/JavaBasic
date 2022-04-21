package class9;

public class HM {

	public static void main(String[] args) {
System.out.println(" ------ Clock ------- ");
String time;
for (int h = 0; h < 24; h++) {
	
	for (int m = 0; m <= 59; m++) {
		if(h<10 && m<10) {
			time="0"+h+":"+"0"+m;
		System.out.println(time);
		}
		else if(h<10 && m>+10) {
			time="0"+h+":"+m;
			System.out.println(time);
		}else if(h>=10 && m<10) {
			time=h+":"+"0"+m;
			System.out.println(time);
		}else {
			time=h+":"+m;
			System.out.println(time);
		}

	}
	}
}
}