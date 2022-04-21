package class14;

public class HM14 {

	String UsernameAndPassword(String userName, String password, String confirmPassword) {
		if(userName.isEmpty() || password.isEmpty()) {
			return"Username and Password cannot be empty";
		}else if(password.length()<8) {
			return"Password is too short";
		}else if (password.contains(userName)) {
			return"Password cannot contain username";
		}else if(!password.equals(password)) {
			return"Password do not match";
			
		}else {
			return"Your username and password has been created";
		}
	}
	
	public static void main(String[] args) {
		HM14 obj=new HM14();
		System.out.println(obj.UsernameAndPassword("","", ""));
		System.out.println(obj.UsernameAndPassword("Petar12","Petar12", "Ivanov12"));
		System.out.println(obj.UsernameAndPassword("Petar123","Petar123", "PetarIvanov123"));
		System.out.println(obj.UsernameAndPassword("Petar12222","Petar12456", "Petar123565"));

	}

}
