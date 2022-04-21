package class23;

import org.w3c.dom.html.HTMLOptGroupElement;

class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a Masters you need Bachelors");
    }
}
public class Task4 {
    /*
     /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
     */

    public static void main(String[] args) {
Masters masters=new Masters();
masters.getPrerequisite();
Bachelors bachelors=new Bachelors();
bachelors.getPrerequisite();
    }

}
