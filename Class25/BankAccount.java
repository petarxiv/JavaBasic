package Class25;

public class BankAccount {
    private double balance=1235;
    private String userName="petar";
    private String password="petar124";
    void printBalance(String userName, String password){
        if(userName.equals(this.password)&&password.equals(this.password)){
            System.out.println(balance);
        }else{
            System.out.println("password is not correct");
        }
    }
}
