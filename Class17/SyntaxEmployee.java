package Class17;
//Create a Class called Employee:
//Create three  variables  empID , salary and set the CEO to “Sumair”
//Create two objects of the class Employee
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects

public class SyntaxEmployee {
    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselClassObject=new SyntaxEmployee();
        aselClassObject.empId="123";
        aselClassObject.salary=200000;

        System.out.println(aselClassObject.empId);
        System.out.println(aselClassObject.salary);
        System.out.println(SyntaxEmployee.CEO); // a good practice

        SyntaxEmployee mozzamObject=new SyntaxEmployee();
        mozzamObject.empId="456";
        mozzamObject.salary=198000;
        System.out.println(mozzamObject.empId);
        System.out.println(mozzamObject.salary);
        System.out.println(mozzamObject.CEO);


        //3 types of variable = Local, instance, static
    }

}
