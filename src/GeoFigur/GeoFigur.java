package GeoFigur;

abstract public class GeoFigur {

	private double xpos;
	private double ypos;
	
	public GeoFigur(){
		
	}
	
	public GeoFigur( double xpos, double ypos){
		this.xpos = xpos;
		this.ypos = ypos;
	}
	
	abstract public double berechneFlaeche();
	
	public String toString(){
		return "xpos: "+this.xpos+", ypos: "+this.ypos;
	}
	
}
