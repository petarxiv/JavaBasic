package Class31;

import java.util.LinkedHashSet;

public class Task2 {
    /*
    //Create the collection that will store single unique Objects of a String type
// in which order is preserved.
//Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {

        LinkedHashSet<String> drinks=new LinkedHashSet<>();
        drinks.add("Coke(Diet)");
        drinks.add("Vodka(Astaffirulah)");
        drinks.add("Tequila(Astaffirulah)");
        drinks.add("margarita(Astaffirulah)");
        drinks.add("Link");
        StringBuilder allDrinks=new StringBuilder();
        for(String drink:drinks){
            allDrinks.append(drink).append(" ");
        }
        System.out.println(allDrinks);

    }
}
