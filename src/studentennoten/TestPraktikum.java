package studentennoten;

import java.util.ArrayList;

public class TestPraktikum {

	public static void main(String[] args) {

		Praktikum javaPraktikum = new Praktikum("Java-Praktikum");
		
		Student florian = new Student("Florian", 1);
		Student maxi = new Student("Maximilian", 2.8);
		
		ArrayList<Student> studenten = new ArrayList<Student>();
		studenten.add(florian);
		studenten.add(maxi);
		
		javaPraktikum.setStudenten(studenten);
		
		System.out.println(javaPraktikum);
	}

}
