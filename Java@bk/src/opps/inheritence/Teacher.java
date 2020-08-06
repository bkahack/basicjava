package opps.inheritence;

public class Teacher  extends Person{  //extends  is a keyword use for inheritance left side class
	public void tech() {						//and right side parents class is there. one class
											//	can only extends one parents class
		System.out.println( name +" is teaching");
	}
	 public void walk() {
		 super.walk();   		//this super keyword allow your to take method of its parents class 
								//without making object
		 System.out.println("Teacher "+ name +" is walking");
	 }
	 public static void laughing() {
		 System.out.println("Teacher is laughting");
	 }
	
}
