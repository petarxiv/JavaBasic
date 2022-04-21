package Class17;

public class Recap {
    public static void main(String [] args){

        //How would you reverse a String word by word? for example
        //		// input=>This is sentence i want to reverse
        //		// output=>sihT si ecnetnes i tnaw ot esrever

        String s="Sunday is great";
        Recap task4=new Recap();
        //System.out.println(Rec
        //ap.reverseString(s));
        String [] strArray=s.split(" ");
        //System.out.println(strArray[0]);
        for(int i=0; i<strArray.length;i++){
            System.out.print(task4.reverseString(strArray[i]+" "));
        }
    }
    String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();

    }
}
