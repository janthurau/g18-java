package speise;

import java.util.ArrayList;

public class Speisekarte {
	
	private String name;
	private ArrayList<Speise> speisen;
	
	public Speisekarte(){
		this.speisen = new ArrayList<Speise>();
	}
	
	public void addSpeise(Speise speise){
		this.speisen.add(speise);
	}
	
	public void remove(Speise speise){
		for( int i = 0; i<this.speisen.size(); i++){
			if( speise == this.speisen.get(i) ){
				this.speisen.remove(i);
			}
		}
	}
	
	public double getAveragePrice(){
		double priceSum = 0;
		
		for( int i = 0; i<this.speisen.size(); i++){
			priceSum += this.speisen.get(i).getPreis();
		}
		
		return priceSum / this.speisen.size();
	}
	
	public String toString(){
		String data = "";
		
		data += this.getName()+"\n";
		data += "Speiseangebote: "+this.getSpeisen().size()+"\n";
		data += "Durchschnittspreis: "+(double)Math.round(this.getAveragePrice()*100)/100+"\n";
		
		for( int i = 0; i<this.speisen.size(); i++){
			data += i + ".: "+this.speisen.get(i).getBezeichnung() +" ("+this.speisen.get(i).getPreis()+")\n";
		}
		
		return data;
	}
	
	public ArrayList<Speise> getSpeisen(){
		return this.speisen;
	}
	
	public void setSpeisen(ArrayList<Speise> speisen){
		this.speisen = speisen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
