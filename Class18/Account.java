package Class18;

public class Account {
    private String userName;
    private String password;
    public String accountNumber;
    private double balance;

    private void printUserName(){
        System.out.println(userName);
    }
    protected void printPassword(){
        System.out.println(password);
    }

    void printBalance(){
        System.out.println(balance);
    }
    public void printAccuntNumber(){
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account account=new Account();

        System.out.println(account.userName);
        System.out.println(account.password);
        System.out.println(account.balance);
        System.out.println(account.accountNumber);

        account.printAccuntNumber();
        account.printPassword();
        account.printBalance();
        account.printUserName();

    }

    public void setBalance(double v) {
    }
}
