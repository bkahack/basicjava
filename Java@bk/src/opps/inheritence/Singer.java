package opps.inheritence;

public class Singer extends Person {
	 public void sing() {
		 System.out.println( name +" is singing");
	 }
	 public void walk() {
		 
		 System.out.println("Singer "+ name +" is walking");  /*overriding is done here by calling 
		 the method of parent class and change it with same parameters*/
	 }
	 public static void laughing() {
		 System.out.println("Singer is laughting");
	 }
}
