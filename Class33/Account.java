package Class33;

public class Account {
        double balance;

        public Account() {
        }

        public void setBalance(double balance) throws InsufficientBalance {
            if (balance <= 0.0D) {
                throw new InsufficientBalance("can't set negative balance");
            } else {
                this.balance = balance;
            }
        }
    }


