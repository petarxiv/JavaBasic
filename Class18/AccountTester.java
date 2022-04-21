package Class18;

public class AccountTester {
    public static void main(String[] args) {


        Account account = new Account();
      //  System.out.println(account.userName);
      //  System.out.println(account.password);
        //  System.out.println(account.balance);
      //  System.out.println(account.accountNumber);
        /*
        accessing a field directly is different
        than accessing the same field with methods
        having different access modifier
         */
        //account.printlnUserName(); private access
        account.printAccuntNumber();
        account.printPassword();
        account.printBalance();
   //     account.printUserName();
    }
}