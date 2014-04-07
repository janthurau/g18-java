package password_validator;

public class PasswordValidator {

	public boolean validatePassword(String password){
		Integer length = password.length();

		// password length must be >= 8 and <= 10
		if( length < 8 || length > 10 ){
			System.out.println("wrong password length");
			return false;
		}
		
		if( !password.matches("/.*[a-z]+.*/")){
			System.out.println("missing lower-case letter");
			return false;
		}
		
		if( !password.matches("/([A-Z]+)/")){
			System.out.println("missing upper-case letter");
			return false;
		}
		
		if( !password.matches("/([0-9]+)/")){
			System.out.println("missing number");
			return false;
		}
		
		return true;
	}
	
}
