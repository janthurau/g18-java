package password_validator;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String password = "";
		Scanner scanner = new Scanner(System.in);
		PasswordValidator validator = new PasswordValidator();
		
		while ( true ){
			
			System.out.print("Please enter your password: ");
			password = scanner.next();
			
			if( validator.validatePassword(password) ){
				System.out.println("OK");
			} else{
				System.out.println("FAIL");
			}

			System.out.println("");
		}
		

	}

}
