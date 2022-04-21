package Class33;
public class Math {
    public Math() {
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException var4) {
            System.out.println("You are trying to divide by zero which is not possible " + var4.getMessage());
        } catch (NullPointerException var5) {
            System.out.println("please initialize the object to avoid this exception");
        }

    }
}
