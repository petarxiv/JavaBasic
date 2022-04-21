package Class33;

import Class18.Account;

public class ThrowDemo {
        public ThrowDemo() {
        }

        public static void main(String[] args) {
            Account account = new Account();

            try {
                account.setBalance(-15.0D);
            } catch (Exception var3) {
                var3.printStackTrace();
            }

        }
    }

