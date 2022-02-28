package model;

public class Student {

	
	int ID; 
	String name;
	int age;
	boolean  active;
	
	public Student(int ID) {
		this.ID = ID; 
	}
	
	public Student(int ID, String name) {
		this.ID = ID; 
		this.name	 = name; 
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	} 
	
	
	
	
	
}
