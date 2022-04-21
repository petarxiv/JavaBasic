package Class20;

public class Lion extends Animal {

    boolean huntOthers=true;
    void roar(){
        System.out.println(name+" is roaring");
    }

    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.name="Alex";
        lion.sleep();
        lion.roar();
    }
}
