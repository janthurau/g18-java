package Tierhandlung;

public class Katze extends Haustier{

	private int schoenheit;
	
	public Katze(){
		
	}
	
	public Katze(String name, double gewicht, int schoenheit){
		super(name,gewicht);
		this.setSchoenheit(schoenheit);
	}
	
	@Override
	public String toString(){
		
		String schoenheit = "";
		
		switch(this.getSchoenheit()){
		case 1:
			schoenheit = "sehr schoen";
			break;
		case 2:
			schoenheit = "schoen";
			break;
		case 3:
			schoenheit = "alltŠglich";
			break;
		case 4:
			schoenheit = "hŠsslich";
			break;
		}
		
		return super.toString()+"\nSchoenheit: "+schoenheit;
	}

	@Override
	public void gibLaut(){
		System.out.println("Kitti miaut");
	}

	public int getSchoenheit() {
		return schoenheit;
	}

	public void setSchoenheit(int schoenheit) {
		if( schoenheit > 0 && schoenheit < 5 ){
			this.schoenheit = schoenheit;
		}
	}
	
}
