package Class31;

import java.util.Hashtable;
import java.util.Set;
import java.util.Map;

public class HasTableDemo {
    public static void main(String[] args) {

        Hashtable<String, String> students = new Hashtable<>();
        students.put("1", "Moreed(Run Moreed)");
        students.put("2", "Emilia");
        students.put("3", "Medine");
        students.put("4", "Yazgul");
        students.put("5", "Gulden(Flower pot)");

        Set<Map.Entry<String, String>> entrySet = students.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry);
        }
    }
}