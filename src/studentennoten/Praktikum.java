package studentennoten;

import java.util.ArrayList;

public class Praktikum {

	private String name;
	private ArrayList<Student> studenten;
	
	public Praktikum(String name){
		this.name = name;
		this.studenten = new ArrayList<Student>();
	}
	
	private void addStudent(Student student){
		this.studenten.add(student);
	}
	
	private double getAverageGrade(){
		int i;
		double grades = 0;
		
		for( i=0; i<this.getStudenten().size(); i++){
			grades += this.getStudenten().get(i).getGrade();
		}
		
		return grades / this.getStudenten().size();
	}
	
	public String toString(){
		String data = this.getName()  + "\n" + "Teilnehmer: "+this.getStudenten().size()+"\n"+"Durchschnitsnote: "+this.getAverageGrade()+"\n";
		Student student;
		
		int i = 0;
		for( i = 0; i<this.getStudenten().size(); i++){
			student = this.getStudenten().get(i);
			data += i + ".: "+student.getName()+" ("+student.getGrade()+")\n";
		}
		
		return data;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public ArrayList<Student> getStudenten(){
		return this.studenten;
	}
	
	public void setStudenten(ArrayList<Student> studenten){		
		this.studenten.clear();
		
		int i = 0;
		for( i=0; i<studenten.size(); i++){
			this.addStudent(studenten.get(i));
		}
	}
	
}
