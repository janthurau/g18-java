package GeoFigur;
import java.lang.Math;

public class Kreis extends GeoFigur{

	private double radius;
	
	public Kreis(){
		super();
	}
	
	public Kreis(double radius, double xpos, double ypos){
		super(xpos, ypos);
		this.radius = radius;
	}
	
	public double berechneFlaeche(){
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public String toString(){
		return "";
	}
	
}
