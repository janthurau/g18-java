package studentennoten;

public class Student {

	private double grade;
	private String name;
	
	public Student(String name, double grade){
		this.setName(name);
		this.setGrade(grade);
	}
	
	public double getGrade(){
		return this.grade;
	}
	
	public void setGrade(double grade){
		this.grade = grade;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return this.getName();
	}
	
}
