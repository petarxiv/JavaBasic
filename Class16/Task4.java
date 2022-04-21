package Class16;

import java.util.Arrays;

public class Task4 {
    public static void main(String [] args){

        //How would you reverse a String word by word? for example
        //		// input=>This is sentence i want to reverse
        //		// output=>sihT si ecnetnes i tnaw ot esrever

        StringBuilder stringBuilder=new StringBuilder("This is sentence i want to reverse");
        System.out.println(stringBuilder.reverse());


        //example
        String s="Sunday";
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        s=str.toString();
        System.out.println(s);

        String newStr="";
        String s2=stringBuilder.toString();
        String[] strArr=s2.split(" ");
        System.out.println(Arrays.toString(strArr));

        for(int i=strArr.length-1;i>=0;i--){
            newStr+=strArr+" ";
        }
        System.out.println(newStr);



        }
        String reverse(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
            StringBuilder stringBuilder=new StringBuilder(inputString);
            stringBuilder.reverse();
            return stringBuilder.toString();



    }
}
