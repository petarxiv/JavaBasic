package Class22;
class UserClass{
    String name;
    String mobileNumber;
    UserClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

}
class UserInfo extends UserClass{
    String userAddress;
    UserInfo(String name, String mobileNumber,String userAddress){
        super(name,mobileNumber);
        this.userAddress=userAddress;
    }
    void userDetail(){
        System.out.println("name ="+name+" MobileNumber ="+mobileNumber+" Address ="+userAddress);
    }
}
public class Task1 {
 /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
 public static void main(String[] args) {
     UserInfo userInfo=new UserInfo("Petar", "1234545", "USA");
     userInfo.userDetail();
 }
}