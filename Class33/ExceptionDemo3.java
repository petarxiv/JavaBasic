package Class33;

public class ExceptionDemo3 {
        public ExceptionDemo3() {
        }

        public static void main(String[] args) {
            System.out.println("0");

            try {
                System.out.println(10 / 0);
                System.out.println("1");
            } catch (ArithmeticException var9) {
                System.out.println("2");

                try {
                    System.out.println(10 / 0);
                } catch (ArithmeticException var8) {
                }
            } catch (Exception var10) {
                System.out.println("Something went wrong");
            } finally {
                System.out.println("6");
            }

            System.out.println("7");
        }
    }

