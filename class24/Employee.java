package class24;

public interface Employee {

    public static final int age=10;
    /*
    by default all the  variables in a interface are public static and final
     */
     void work();


     /*
All the methods inside an interface do not have body
are abstract public
 */

}

class Tester implements Employee{


    @Override
    public void work() {
        System.out.println("Testing a website");
    }

    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.work();
        System.out.println(Employee.age);
    }
}











