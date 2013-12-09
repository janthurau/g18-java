package schule;

public class Schule {

	public static void main(String[] args) {		
		Lehrer Renfordt = new Lehrer("Jutta", "Renfordt");
		Schueler Jan = new Schueler("Jan", "Thurau");
		
		System.out.println(Jan.toString());
		System.out.println(Renfordt.toString());
	}

}
