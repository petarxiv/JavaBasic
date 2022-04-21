package Class33;

public class ExceptionDemo4 {
    public ExceptionDemo4() {
    }

    public static void main(String[] args) {
        System.out.println("0");

        try {
            System.out.println("1");
            System.out.println(10 / 0);
            System.out.println("2");
        } catch (ArithmeticException var2) {
            System.out.println(var2.getMessage());
            System.out.println(var2.getClass());
        }

        System.out.println("4");
    }
}

