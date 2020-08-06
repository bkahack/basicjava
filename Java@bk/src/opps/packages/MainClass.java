package opps.packages;

import opps.packages.models.Student; 
import opps.packages.models.Teacher;	//one by one class is importing.
import opps.packages.models.*;    // all classes inside models are imported. using *
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj =new Student("Prashant");
		Teacher obj2 =new Teacher();
//		obj.name="jerry";  		//It is not visisble to other class because it is private.
//		obj.getPassword();
//		obj.hello(); we can't access a default class outside its parents class 
	}

}
