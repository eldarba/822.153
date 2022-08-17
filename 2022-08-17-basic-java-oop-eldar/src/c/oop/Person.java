package c.oop;

public class Person {
	
	// attributes - define the object set of data
	private int id;
	private String name;
	private int age;
	
	public void setAge(int theNewAge) {
		if(theNewAge >= 0 && theNewAge <= 120) {
			age = theNewAge;
		}
	}
	
	
	
	public int getAge() {
		return age;
	}
	
	public void setName(String theNewName) {
		if(theNewName.length() < 25) {
			name = theNewName;
		}
	}
	
	

}
