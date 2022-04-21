package Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class MapDemo1 {
    public static void main(String[] args) {

        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();
        while (it.hasNext() )
        {
            System.out.print( it.next() + " " );
        }

       /*
        HashMap<String, Double>fruitMap=new HashMap<>();
       // fruitMap.put("Apple",20); auto casting does not work in collections and maps
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);
        fruitMap.put("Banana",12.5); //duplicate values are overwritten last values in retained
        System.out.println(fruitMap);
        System.out.println(fruitMap.get("kiwI")); //case sensitive
        fruitMap.remove("Mango");
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsKey("Kiwi"));
        System.out.println(fruitMap.containsKey("Camel"));
        System.out.println(fruitMap.containsValue(20.0));
        System.out.println(fruitMap.isEmpty());
        System.out.println(fruitMap.size());
        fruitMap.replace("Banana",50.0);
        System.out.println(fruitMap);
*/
    }
}
