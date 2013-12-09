package bootsverleih;

public class Segelboot extends Boot {
	
	public Segelboot(){
		super();
	}

	public Segelboot(Integer id, String name){
		super(id, name);
	}
	
	public String toString(){
		return "Name: "+this.getName()+", Nummer: "+this.getId()+"\nAnzahl der Segel: 4";
	}
	
}
