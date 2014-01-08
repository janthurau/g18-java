package Tierhandlung;

public class Hund extends Haustier {

	private int angriffspotential;
	
	public Hund(String name, double gewicht, int angriffspotential){
		super(name,gewicht);
		this.setAngriffspotential(angriffspotential);
	}
	
	public Hund(){
		
	}
	
	@Override
	public void gibLaut(){
		System.out.println("Bello bellt");
	}
	
	@Override
	public String toString(){
		
		String angriffspotential = "";
		
		switch(this.getAngriffspotential()){
		case 1:
			angriffspotential = "sehr aggresiv";
			break;
		case 2:
			angriffspotential = "aggresiv";
			break;
		case 3:
			angriffspotential = "kaum aggresiv";
			break;
		case 4:
			angriffspotential = "nicht aggresiv";
			break;
		}
		
		return super.toString()+"\nAngriffspotential: "+angriffspotential;
	}

	public int getAngriffspotential() {
		return angriffspotential;
	}

	public void setAngriffspotential(int angriffspotential) {
		if( angriffspotential > 0 && angriffspotential < 5 ){
			this.angriffspotential = angriffspotential;

		}
	}
	
}
