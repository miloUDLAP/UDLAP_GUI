package mx.udlap.model;

public abstract class Person {
	// member variables
	private String name;
	private String surname;
	private int id;
	

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
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name
	 * @param surname
	 * @param id
	 */
	public Person(String name, String surname, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	/**
	 * @param name
	 * @param surname
	 */
	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	/**
	 * 
	 */
	public Person() {
		super();
	}

	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}
}
