package Class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name="Petar";
        String name2="Kristina";
        //Not scalable if we have to store large amount of data
        //Arrays can be good option to tackle this problem

        String[] names={"Petar", "Milos"};
        //names[2]="Kristina";
        String[] names2=new String[1000];
        names[0]="Elena";
        names[2]="Milos";
        System.out.println(Arrays.toString(names2));
        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList=>Name of the class
        //<> diamond operator
        //String datatype
        syntaxStudents.add("Dmitry");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Andrew");
        System.out.println(syntaxStudents);


    }
}
