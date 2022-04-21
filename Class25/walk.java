package Class25;

interface HealthAble{
    void healthy();
}
public interface walk extends HealthAble {

    void burnCalories();
}
interface Milk extends HealthAble{

    void giveEnergy();
}
interface Banana extends HealthAble{

    void giveEnergy();
}

class Demo implements Banana{

    @Override
    public void healthy() {
        System.out.println("Banana is good for health");
    }

    @Override
    public void giveEnergy() {
        System.out.println("it gives us energy");

    }

}