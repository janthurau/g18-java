package bootsverleih;

public class Bootsverleih {

	public static void main(String[] args) {
		Paddelboot paddelboot = new Paddelboot();
		Segelboot segelboot = new Segelboot(14, "Daria");
	
		paddelboot.setId(12);;
		paddelboot.setName("Marie");
		
		System.out.println(paddelboot.toString());
		
		System.out.println("");
		
		System.out.println(segelboot.toString());
	}

}
