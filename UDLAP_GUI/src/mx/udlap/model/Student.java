/**
 * 
 */
package mx.udlap.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author buns
 *
 */
public class Student extends Person {

	private String favoriteDrink;

	private ArrayList courses;
	/**
	 * 
	 */
	public Student() {
		super();
		courses = new ArrayList<Course>();
	}
	/**
	 * @param favoriteDrink
	 * @param courses
	 */
	public Student(String favoriteDrink, ArrayList courses) {
		super();
		this.favoriteDrink = favoriteDrink;
		this.courses = courses;
	}
	/**
	 * @param name
	 * @param surname
	 * @param id
	 */
	public Student(String name, String surname, int id) {
		super(name, surname, id);
		this.courses = new ArrayList();
		this.favoriteDrink = "Pulque";
	}
	/**
	 * @param name
	 * @param surname
	 * @param id
	 */
	public Student(String name, String surname, int id, String drink) {
		super(name, surname, id);
		this.courses = new ArrayList();
		this.favoriteDrink = drink;
	}
	/**
	 * @param name
	 * @param surname
	 */
	public Student(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 */
	public Student(String name) {
		super(name);
	}
	
	
	public void printOf() {
		System.out.println("\nStudent Details:");
		System.out.println("----------------");
		System.out.println("\tFirstname: " +this.getName());
		System.out.println("\tLastname:  " +this.getSurname());
		System.out.println("\tID:  		 " +this.getId());
		System.out.println("\tDrink:     " +this.favoriteDrink);
		
		
		/* Like this you can use the iterator
		 * The previous example was wrong, because in the while-loop
		 * every time a brandnew iterator is obtained starting at index 0
		 * Explanation: http://stackoverflow.com/questions/37298398/java-endless-loop-with-listiterator-hasnext 
		 * 
		Iterator iter = this.courses.iterator();
		
		while(iter.hasNext()) {
			Course c = (Course) iter.next();
			System.out.println(c.getKey());
		}
		
		*/
		
		/* Or you can use the for-loop presented in today's class
		 * The iterator version is prefered since it is more elegant
		 * and uses oop techniques
		*/
		
		if(this.courses.size() > 0) {		
			for (int i=0; i<this.courses.size(); i++) {
				Course c = (Course) courses.get(i);
				c.printOfWithoutStudentDetails();	
				System.out.println("\t\t----------------------");
			}
		} else {
			System.out.println("Student does not attend to any courses.");
		}
		 

		System.out.println();
	}
	
	public void addCourse(Course c) {
		this.courses.add(c);
	}
	
	public void removeCourse(Course c) {
		this.courses.remove(c);
	}
	public void printOfWithoutCourseDetails() {
		// TODO Auto-generated method stub
		System.out.println("\t\t" +this.getSurname() + ", " + this.getName() + " (" + this.getId() + ") + " + this.favoriteDrink);
		
	}
	
}
