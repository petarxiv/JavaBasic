package Class21;

public class ClassA {
    void method(){
        System.out.println("AA");
    }
}
class ClassB extends ClassA{
    void method(){
        System.out.println("B");

     }
     void test(){
        method(); // call the same class method
        this.method(); // call the same class method
        super.method();// call the same parent method
     }

}
class Tester{
    public static void main(String[] args) {
        ClassB classB=new ClassB();
        classB.test();
    }
}