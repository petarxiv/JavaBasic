package Class16;

public class StringVsStringBuilder {
   public static void main(String [] args){
       String s=new String("Asghar is Great"); //original string
       s.concat("hahah"); //add new String
       System.out.println(s.replace(" ",""));
       System.out.println(s);

       StringBuilder stringBuilder=new StringBuilder("Asghar Is Great");

       System.out.println(stringBuilder.reverse());

       stringBuilder.append("Hahha");
      // System.out.println(stringBu ilder.append("Hahha"));
       System.out.println(stringBuilder); //printing out the original string

       boolean falg=true;
       if(!falg||falg){
       }
   }
    }

