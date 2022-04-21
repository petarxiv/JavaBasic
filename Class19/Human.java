package Class19;

public class Human {
    String name;
    int age;
    double weight;
    char gender;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;

            System.out.println("Important code");
            System.out.println("Important code");
        }
             public Human(String name, int age, double weight) {
                 this(name, age);
                 this.weight=weight;
             }
                  public Human(String name, int age, double weight, char gender) {
                     this(name, age, weight);
                     this.gender = gender;
    }
}
