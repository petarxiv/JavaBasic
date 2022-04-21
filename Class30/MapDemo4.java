package Class30;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        // fruitMap.put("Apple",20); auto casting does not work in collections and maps
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 20.0);

        //getting the iterator from the map with the help of method chaining
        //first we are getting the set from the map when we are getting the iterator on that set
        Iterator<String>iterator=fruitMap.keySet().iterator();

        while(iterator.hasNext()){ //checks if there are still elements left in the iterator
            String key=iterator.next(); //getting the key from the iterator
            Double value=fruitMap.get(key);//getting the corresponding value from the map by passing the keys
            if (key.contains("e")&&value>=20){
                iterator.remove(); //if both the conditions are satisfied we remove the element from the map
            }
        }
        System.out.println(fruitMap);
    }
}
