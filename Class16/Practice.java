package Class16;

public class Practice {
    public static void main(String [] args){
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf("dab"));
        System.out.println(str.indexOf("target2"));

        // Another practice

        String s1="hello how are you";

        System.out.println(s1.endsWith("u"));
        System.out.println(s1.endsWith("world"));
        System.out.println(s1.endsWith("are"));
        System.out.println(s1.endsWith("you"));

        // Another practice

        String s1q="syntax technologies";
        String s2="SYNTAX TECHNOLOGIES";

        String s1x=s1q.toUpperCase();
        System.out.println(s1x);

        String s2x=s2.toLowerCase();
        System.out.println(s2x);

        // Another practice

        String name="Timmy";

        System.out.println(name.length());

        // Another practice

        String s1m="hello";
        String s2n="";


        if(s1m.equals("hello")){
            System.out.println(false);
        }else{
            System.out.println(true);
        }

        if(!s2n.equals("")){
            System.out.println(false);
        }else{
            System.out.println(true);
        }

        // Another practice







    }
}
