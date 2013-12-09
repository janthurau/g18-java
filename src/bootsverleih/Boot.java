package bootsverleih;

abstract public class Boot {

	private Integer id;
	private String name;
	
	public Boot(){
		
	}
	
	public Boot (Integer id, String name){
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "Boot; ID: "+this.id+", Name: "+this.name;
	}
	
}
