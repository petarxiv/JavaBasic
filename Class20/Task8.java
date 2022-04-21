package Class20;
class AA{
    static void printF() {
        System.out.println("Batch 12 will be making bag of money");
    }
}

public class Task8 {

    /*
        Write program to inherit class A that has method printF
        which is static and call or reuse that method into class B
         */
    public static void main(String[] args) {
        BB.printF();
    }
}
    class BB extends AA{
}
