package Class21;

public class ClassAA {
    String name;
    int age;
    double weight;

    public ClassAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
class ClassBB extends ClassAA{
    public ClassBB(String name, int age, double weight){
        super(name, age, weight);
        /*
        Because constance from the parent classes don't participate in inheritance
        we need to create a matching constructor in the child classes as well
        we can use super() to call the constructor from the parent class so that we don't have to repeat the code
         */
    }
}
class Test {
    public static void main(String[] args) {

        ClassBB classBB = new ClassBB("Petar", 23, 70);
        classBB.printInfo();
    }
}






