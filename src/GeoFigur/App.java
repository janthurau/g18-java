package GeoFigur;

public class App {

	public static void main(String[] args) {
			Quadrat quadrat1 = new Quadrat(10, 1,1);
			Kreis kreis1 = new Kreis(5,1,1);
						
			System.out.println(quadrat1.berechneFlaeche());
			System.out.println("");
			System.out.println(kreis1.berechneFlaeche());
	}

}
