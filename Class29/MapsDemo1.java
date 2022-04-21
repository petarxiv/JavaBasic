package Class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Petar Ivanov");
        names.add("Muhammad");
        System.out.println(names.get(0));

        HashMap<Integer,String>map=new HashMap<>();
        map.put(1234567888, "Petar Ivanov");
        map.put(1234568, "Muhammad");
        System.out.println(map.get(1234567888));

        HashMap<String, String>groceries=new HashMap<>();
        groceries.put("Lilly","Eggs, milk, Bread etc");
        groceries.put("Teyfur","Camel, Horse, CamelHorse etc");
        groceries.put("Ashgar","Macbook, iphone 13, Apple Monitor Stand for $1000 etc");
        System.out.println("Lilly");
    }
}
