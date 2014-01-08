package Tierhandlung;

public class Tierhandlung {

	public static void main(String[] args) {
		Katze katze = new Katze("Kitti", 5, 1);
		Hund hund = new Hund();
		
		hund.setName("Bello");
		hund.setGewicht(12);
		hund.setAngriffspotential(4);
		
		System.out.println(hund);
		System.out.print("FŠhigkeiten: ");
		hund.gibLaut();
		
		System.out.println("");
		
		System.out.println(katze);
		System.out.print("FŠhigkeiten: ");
		katze.gibLaut();
	}

}