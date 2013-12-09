package schule;

abstract public class Person {

	protected String firstname = "";
	protected String lastname = "";
	
	public Person(String firstname, String lastname){
			this.firstname = firstname;
			this.lastname = lastname;
	}
	
	public Person setFirstname(String firstname) throws Exception {
		
		if( !this.isValidName(firstname) ){
			throw new Exception("Invalid firstname");
		}
		
		this.firstname = firstname;
		
		return this;
	}
	
	public Person setLastname(String lastname) throws Exception{
		
		if( !this.isValidName(lastname) ){
			throw new Exception("Invalid lastname");
		}
		
		this.lastname = lastname;
		
		return this;
	}
	
	public String getFirstname(){
		return this.firstname;
	}
	
	public String getLastname(){
		return this.lastname;
	}
	
	public String toString(){
		return this.getFirstname() + ' ' + this.getLastname();
	}
	
	private boolean isValidName(String value){
		return value.matches("^([a-zA-Z]+)$");
	}
	
}
