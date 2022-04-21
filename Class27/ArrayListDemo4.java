package Class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Orange");
            fruits.add("Banana");


            ArrayList<String>vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onions");
        vegetables.add("Carrot");

        ArrayList<String>groceries=new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegetables);
        groceries.addAll(groceries);

        ArrayList<String>itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.addAll(vegetables);
    }
}
