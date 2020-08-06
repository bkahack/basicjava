package opps.statics;

import opps.statics.AStatic.C;

public class StaticKeyword {

	static {
		System.out.println("Static block 1");  		//this is a static block this is executed 
	}
	static {										//before the main method
		System.out.println("Static block 2");
	}
		
	public static void main(String[] args) {
		AStatic obj=new AStatic();
		AStatic.B obj2=obj.new B();  	//to create a object of B class which is non static we
										//have to create object of AStatic class or parent lass
		
		
		
		C obj3=new AStatic.C();			//to create a object of C class which is  static we dont 
										//have to create object of AStatic class or parent lass
		System.out.println("main method ");
	}
		static {
			System.out.println("Static block 3");   		//this is a static block
		}
	

}

