package mx.udlap.model;

import java.util.ArrayList;

public class Professor extends Person {
	private String favoriteFood;
	private ArrayList<Course> courses;
	
	public Professor(String name, String surname, int id, String favoriteFood, ArrayList<Course> courses) {
		super(name, surname, id);
		this.favoriteFood = favoriteFood;
		this.courses = courses;
	}

	public Professor() {
		super();
		this.courses = new ArrayList<Course>();
		// TODO Auto-generated constructor stub
	}

	public Professor(String name, String surname, int id) {
		super(name, surname, id);
		this.courses = new ArrayList<Course>();
		// TODO Auto-generated constructor stub
	}
	
	public Professor(String name, String surname, int id, String food) {
		super(name, surname, id);
		this.favoriteFood = food;
		this.courses = new ArrayList<Course>();
		// TODO Auto-generated constructor stub
	}

	public Professor(String name, String surname) {
		super(name, surname);
		this.courses = new ArrayList<Course>();
		// TODO Auto-generated constructor stub
	}

	public Professor(String name) {
		super(name);
		this.courses = new ArrayList<Course>();
		// TODO Auto-generated constructor stub
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void printOfWithoutCourses() {
	}
	
	public void printOf() {
		System.out.println("\nProfessor Details:");
		System.out.println("----------------");
		System.out.println("\tFirstname:\t" +this.getName());
		System.out.println("\tLastname:\t" +this.getSurname());
		System.out.println("\tID:\t" +this.getId());
		System.out.println("\tFood:\t" +this.favoriteFood);
		
		if(this.courses.size() > 0) {		
			for (int i=0; i<this.courses.size(); i++) {
				Course c = (Course) courses.get(i);
				c.printOfWithoutStudentDetails();	
				System.out.println("\t\t----------------------");
			}
		} else {
			System.out.println("Prof is a lazy guy, not having any courses.");
		}
	}

	public void addCourse(Course c) {
		if(this.courses != null) {
			this.courses.add(c);
		}		
	}
	
	public void removeCourse(Course c) {
		this.courses.remove(c);
	}

}
