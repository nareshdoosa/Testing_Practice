package test.java;

/**
 * Encapsulation is to hide the implementation details from users. If a data
 * member is private it means it can only be accessed within the same class.
 * No outside class can access private data member (variable) of other class.
 * To achieve encapsulation in Java. Declare the variables of a class as private.
 * Provide public setter and getter methods to modify and view the variables
 * values.
 *
 */

public class Encapsulation {

	private String name;
	private String idNum;
	private int age;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;

	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newIdNum) {
		idNum = newIdNum;
	}
}
