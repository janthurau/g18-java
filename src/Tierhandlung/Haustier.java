package Tierhandlung;

abstract public class Haustier {
	
	private String name;
	private double gewicht;
	
	
	public Haustier(){
		
	}
	
	public Haustier(String name, double gewicht){
		this.setGewicht(gewicht);
		this.setName(name);
	}
	
	public String toString(){
		return "Name: " + this.getName() + ", Gewicht: " + this.getGewicht() + " kg";
	}
	
	// @TODO: Implement
	public double fressen(double g){
		return this.getGewicht();
	}
	
	abstract public void gibLaut();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGewicht() {
		return this.gewicht;
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	
}
