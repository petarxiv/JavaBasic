package Class19;

public class Camel {
    //its a very good practice to make the fields private
    private String name;
    private int age;
    private double weight;

    // No argument/zero argument constructor
    Camel(){
        /* Write some important lines of code that you want to execute when the object
        of a class is created for example
        you might want to fetch some info from internet or from your hard dirk to give initial values to the fileds
         */
    }

    //purpose of constructor is to give initial values to the fields of a class
    Camel(String camelName, int camelAge, double camelWeight){
        name=camelName;
        age=camelAge;
        weight=camelWeight;
    }
    //Rule no 1Constructor don't have return types like int String not even void
    void Camel(String camelName, int camelAge, double camelWeight) {
        name = camelName;
        age = camelAge;
        weight = camelWeight;
    }

    void printCamelName(){
        System.out.println("Name "+name);
    }

    void setName(String camelName){
        name=camelName;
    }

}
