package opps.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog d=new Dog();
		Pet p=d;
		Animal a=d;
		d.walk();
		p.walk();    		/* dog wala method call kiya kyu ki object dog ka banaya gya tha and 
							run time polymorphism work ho raha hai.
							run time polymorphism is also know as dynamic binding ,late bining
							 overriding.
							 */
		greeting("Prashant");			// this is known as compile time polymorphism because
										//we know in compile time wihch is going to work.
		greeting();
										/* compile time polymorphysim is also know as static 
										 binding , early binding and method overloading.
										 
										 */
	}
	public static void greeting() {
		System.out.println("hi,there");
	}
	public static void greeting(String s) {     	//method overloading
		System.out.println("hi " +s );
	}

}
  //variable or state cannot be override!!!!!