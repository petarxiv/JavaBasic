package class13;

public class Task4 {

	String createEmail(boolean email,String userName, String lastName, String emailType) {
		if(email) {
			return(userName+lastName+emailType);
		}else {
			return("Unknown");

		}
	}
	
	
	public static void main(String[] args) {
		//Create a method createEmail(). Based on values of users name, lastName and email type, 
		//your method should return complete email Address. 
		//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or 

		Task4 obj=new Task4();
		System.out.println(obj.createEmail(true,"petar","ivanov","gmail.com"));
	}

}
