package Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7 {

        public static void main(String[] args) {
            HashMap<String,Double> fruitMap=new HashMap<>();
            //fruitMap.put("Apple",20); auto casting does not work in collections and maps
            fruitMap.put("Apple",20.0);
            fruitMap.put("Banana",10.2);
            fruitMap.put("Kiwi",105.2);
            fruitMap.put("Orange",16.5);
            fruitMap.put("Mango",20.0);

            Iterator<Map.Entry<String,Double>> iterator=fruitMap.entrySet().iterator();

            while (iterator.hasNext()){
                //getting the Entries from Iterator
                Map.Entry<String,Double> entry=iterator.next();
                //getting the keys and values from the Entry object
                if(entry.getKey().endsWith("e") || entry.getValue()>=20){
                    iterator.remove();
                }
            }
            System.out.println(fruitMap);
        }
    }