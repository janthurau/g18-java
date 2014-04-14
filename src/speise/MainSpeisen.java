package speise;

public class MainSpeisen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Speise salami = new Speise();
		salami.setBezeichnung("Salami");
		salami.setPreis(8.95);
		
		Speise spaghetti = new Speise();
		spaghetti.setBezeichnung("Spaghetti Pomodoro");
		spaghetti.setPreis(6.95);
		
		Speise gemueseauflauf = new Speise();
		gemueseauflauf.setBezeichnung("Gemueseauflauf");
		gemueseauflauf.setPreis(12.95);
		
		Speisekarte speisekarte = new Speisekarte();
		speisekarte.setName("Tageskarte IT3X");
		speisekarte.addSpeise(salami);
		speisekarte.addSpeise(spaghetti);
		speisekarte.addSpeise(gemueseauflauf);
		
		System.out.println(speisekarte);
		
		speisekarte.remove(gemueseauflauf);
		
		System.out.println(speisekarte);
	}

}
