 package opps.inheritence;

public class MainClass {

	public static void main(String[] args) {
		
		Teacher t=new Teacher();
		t.name="Mr. harry";
		t.walk();
//		t.tech();
//		t.eats();
//		t.laughing(); 
//		Singer s=new Singer();
//		s.name="Neha";
//		s.walk();
//		s.eats();
//		s.sing();
//		s.laughing();    			//all above code is use without static method
		
		// now for here we are going to use static method laughing
//		Person p=t;     // this type is called implicit or up casting
		
	}
}										//extends  is a keyword use for inheritance left side class
										//and right side parents class is there. one class
										//	can only extends one parents class