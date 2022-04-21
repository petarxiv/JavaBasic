package Class22;
class Shape{
    double radius;
    Shape(double radius){
        this.radius=radius; //initializing the field through constructor
    }
}
class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
    void calculateArea(){
        System.out.println(Math.PI*Math.pow(radius,2));

    }

}
public class Task2 {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.calculateArea();

    }
}
