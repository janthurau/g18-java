package GeoFigur;
import java.lang.Math;

public class Quadrat extends GeoFigur {

	private double seite;
	
	public Quadrat(){
		
	}
	
	public Quadrat(double seite, double xpos, double ypos){
		super(xpos, ypos);
		this.seite = seite;
	}
	
	public double berechneFlaeche(){
		return Math.pow(this.seite, 2);
	}
	
	public String toString(){
		return "";
	}
	
}
