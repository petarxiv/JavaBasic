package class24;

public class Parent {

    final String name="Vladen";
    final void method(){
        //name="Mr. A"; can reassign if a variable is final
        System.out.println("I am parent");
    }

}

class Child extends Parent{


   /* void method(){
       can't override because  it is final method
    }*/

}

