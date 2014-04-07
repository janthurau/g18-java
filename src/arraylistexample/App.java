package arraylistexample;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		ArrayList<String> liste = new ArrayList<String>();
		
		liste.add("Apfel");
		liste.add("Birne");
		liste.add("Stuhl");
		liste.add("Orange");
		liste.add("Zitrone");
		
		System.out.println(liste);
		
		liste.remove("Stuhl");
		
		System.out.println(liste);
		
		if( liste.contains("Stuhl")){
			System.out.println("Der Stuhl ist noch drin");
		} else {
			System.out.println("Der Stuhl ist drau§en");
		}
		
		if( liste.contains("Birne") ){
			System.out.println("Die Birne ist noch drin");
		} else {
			System.out.println("Die Birne ist drau§en");
		}
	}

}
