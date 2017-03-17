/**
 * 
 */
package mx.udlap.model;

import java.util.ArrayList;

/**
 * @author 22107
 *
 */
public class Course {

	private String name;
	private String key;
	private String desc;
	private Professor prof;

	private ArrayList<Student> students;
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public Professor getProf() {
		return prof;
	}
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	/**
	 * @param name
	 * @param key
	 * @param desc
	 */
	public Course(String name, String key, String desc) {
		super();
		this.students = new ArrayList<Student>();
		this.name = name;
		this.key = key;
		this.desc = desc;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void addStudent(Student s) {
		this.students.add(s);
	}
	
	public void removedStudent(Student s) {
		this.students.remove(s);
	}
	
	public void printOfWithoutStudentDetails() {
		System.out.println("\t\tCourse: " + name + " - " + key);
		System.out.println("\t\t" + desc);
	}
	
	public void printOf() {
		System.out.println("\nCourse Details:");
		System.out.println("----------------");
		System.out.println("\tCourse: " + name + " - " + key);
		System.out.println("\t" + desc);	
		
		if(prof != null) {			
			prof.printOfWithoutCourses();	
		}
		
		if(this.students.size() > 0) {		
			for (int i=0; i<this.students.size(); i++) {
				Student s = (Student) students.get(i);
				s.printOfWithoutCourseDetails();				
			}
		} else {
			System.out.println("No student does attend to this course");
		}
	}
	
}
