package Class30;

import java.util.*;

public class Task1 {
    /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
    public static void main(String[] args) {

        /*
        List<String> list=new LinkedList<>();
       list.addFirst("Anton");
         */
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"Google");
        map.put(2,"Syntax");
        map.put(3,"Tesla");
        map.put(1,"Amazon");
        map.put(5,"Amazon");
        map.put(4,"Syntax");
        map.put(7,"Meta");
        System.out.println(map.size());

        map.replace(4,"Facebook"); //update
        System.out.println(map);
        map.remove(7);
        System.out.println(map);

    }
}
