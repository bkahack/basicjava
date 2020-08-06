package opps;

 class cat{ //created class -logical entity .don't take memory.blue print for the object.in a class many object can created
	int legs,eyes; //created state or property
	//object take 8 byte in head memory without inisilistion
	//always take 8 byte mtlb 8 bit kr kr ke hi leta h
	
	
	
	public void walk() { //created method or function in c language. or behavior
		System.out.println("cat can walk");
	}
	public void climbTree() {
		System.out.println("cat can climb tree");
	}
	public void dis(){
		System.out.println("Cat has " +eyes + " eyes and " +legs+ " legs" );
	}
//	cat(){
//		legs=4;
//		eyes=5;
//	}
}
public class ClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat cat1=new cat();  //created object -object is instance of class. its takes memory (heap memory).its has some state and behavior
		cat1.legs=4; //.legs we can initializing the value of state .
		cat1.eyes=2;
		// this . is seprator in java not dot
		cat1.dis();  // for calling any function or method of a class use . and then function or method name
		cat cat2=new cat(); //new is a keyword created space or memory for the cat2 and assign address to cat2
		cat2.legs=3;
		cat2.eyes=2;
		cat2.dis();
		
	}

}
