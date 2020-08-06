package opps.inheritence;

public class Person {
	 protected String name;
	 // all the method is related to object
	 public void walk() {
		 System.out.println("Person "+ name +" is walking");
	 }
	 public void eats() {
		 System.out.println("Person "+name +" is eating");
	 }
	 // this static method is related to class
	 public static void laughing() {
		 System.out.println("Person is laughting");
	 }
}
