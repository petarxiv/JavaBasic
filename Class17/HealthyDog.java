package Class17;

public class HealthyDog {

    //when the information is expected to be different from object to object
    //we store that information in an instance variable
    String name; //instance
    String color; //instance
    static int numberOfLegs; //static
    void eat(){
        int noOfTimes=3; //local
        System.out.println(name+" eats "+noOfTimes);
    }
    public static void main(String [] args){
        HealthyDog dog=new HealthyDog(); //local

        dog.name="scooby";
        dog.color="Pink";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tomy";
        dog2.color="Navi blue";
        System.out.println(HealthyDog.numberOfLegs);
        dog2.eat();


    }



}
