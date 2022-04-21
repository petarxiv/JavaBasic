package class24;

class Student{
    void study(){
        System.out.println("Students must study to pass");
    }
    void doHomeWork(){
        System.out.println("Students must Do homework");
    }
    void practice(){
        System.out.println("Students must to practice");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax students must study 25 hours a week");
    }
    void doHomeWork(){
        System.out.println("Syntax students must solve Repls");
    }
    @Override
    void practice(){
        System.out.println("Syntax students must do their own research");
    }
}
class CollegeStudent extends Student{
    @Override
            void doHomeWork() {
        System.out.println("College students can skip some of the homework");
    }
}
class SchoolStudent extends Student{

}

public class Task1 {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
}
