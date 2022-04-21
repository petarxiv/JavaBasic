package Class28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Student petar=new Student("Petar",20,"Memes");
        Student kristina=new Student("Kristinaa",39,"Sleeping");
        Student milos=new Student("Milos",51,"Eating");

        LinkedList<Student> studentLinkedList=new LinkedList<>();
        studentLinkedList.add(petar);
        studentLinkedList.add(kristina);
        studentLinkedList.add(milos);
    }
}
class Student {
    public Student(String name, int age, String hobbies) {
        this.name=name;
        this.age =age;
        this.hobbies =hobbies;

    }
    String name;
    int age;
    String hobbies;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}