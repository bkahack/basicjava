package opps.packages.models;

public  class Student {
	
	private String name;
	
	public Student(String name){   //this is a constructor. with same parameters.
		this.name=name;
	}
	
	public String getName() {	//this is a method. and public access modifier.we can access it anywhere
		getPassword();  // we can access get password even it is private in its own class.
		return name;
	}
	private String getPassword() { //It is a private access modifier and method.we can access it only in its class. 
		return "454252112";
	}
	String hello() {			//It is default access modifier we can access it only in its parent package.
		return "hello sir";
	}
}
