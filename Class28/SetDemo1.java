package Class28;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        HashSet<String>fruit=new HashSet<>();
            fruit.add("Apple");
            fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
