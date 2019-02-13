package test.java;

public class EncapsulationTest {

	public static void main(String[] args) {
		Encapsulation test = new Encapsulation();

		test.setAge(30);
		test.setName("testing");
		test.setIdNum("123test");
		System.out.println("Name:->" + test.getName() + "\nIdNum:-> " + test.getIdNum() + "\nAge:->" + test.getAge());
	}
}
