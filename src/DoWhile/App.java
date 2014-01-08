package DoWhile;

import java.lang.Math;

public class App {

	public static void main(String[] args) {

		int zaehler = 0;
		
		do{
			System.out.print((int)Math.pow(3, zaehler++)+" ");
		} while( zaehler < 5 );
		
		
		// TROOOOOL
		do{
			System.out.println("\n1 3 9 27 81");
		}
		while( false );
	}

}
