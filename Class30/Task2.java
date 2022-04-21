package Class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("France","Paris");
        countries.put("Italy","Rome");
        countries.put("Sweden","Stockholm");
        countries.put("Germany","Berlin");
        //Part 1
        for(Map.Entry<String,String>entry:countries.entrySet()){
            System.out.println(entry.getKey()+" ");
            System.out.println(entry.getValue());
        }
        Iterator<Map.Entry<String,String>> iterator=countries.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //Part 2
        for(String value:countries.values()) {
            System.out.println(value);
        }
        Iterator<String>iterator1=countries.values().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}