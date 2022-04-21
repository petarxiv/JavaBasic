package class5;
import java.util.Scanner;
public class HM5 {
	public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
       System.out.println("Quiz score");
       int x1=x.nextInt();
       System.out.println("Mid term");
       int x2=x.nextInt();
       System.out.println("Final score");
       int x3=x.nextInt();
       int x4=((x1+x2+x3)/3);
       System.out.println(x4);
       
		if(x4>90) {
			System.out.println("Grade A");
		}else if(x4>=70 && x4<=90) {
			System.out.println("Grade B");
		}else if(x4>=50 && x4<70) {
			System.out.println("Grade C");
		}else if(x4<50) {
			System.out.println("Grade F");
		}
	}

}
