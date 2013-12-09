package bootsverleih;

public class Paddelboot extends Boot{

	public Paddelboot(){
		super();
	}
	
	public Paddelboot(Integer id, String name){
		super(id, name);
	}
	
	public String toString(){
		return "Name: "+this.getName()+", Nummer: "+this.getId()+"\nAnzahl der Paddel: 4";
	}
	
}
