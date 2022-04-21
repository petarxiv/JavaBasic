package Class30;
import java.util.Map;
import java.util.TreeMap;
public class Task4Tester {
    public static void main(String[] args) {
        TreeMap<String,Person> personTreeMap=new TreeMap<>();
        personTreeMap.put("abc",new Person("Safiul","Ibbahahh",42,150000));
        personTreeMap.put("abc",new Person("Guldan","Ibhh",16,140000));
        personTreeMap.put("abc",new Person("Mr.A","A",22,170000));
        personTreeMap.put("abc",new Person("Nassir","Ariyan",27,180000));

        for(Map.Entry<String,Person> p:personTreeMap.entrySet()){
            System.out.println(p);
        }
    }
}

