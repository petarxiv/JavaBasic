package Class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("C");

        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>(arrayList);
        System.out.println(linkedHashSet);
        TreeSet<String>treeSet=new TreeSet<>(arrayList);
        System.out.println(treeSet);
        arrayList.clear(); //removing all the original elements
        arrayList.addAll(linkedHashSet); //adds all unique with the insertion order
        System.out.println("Array");
        System.out.println(arrayList);



    }
}
