package encapsulation;

public class Student {
	private int age ;
	private String name;
	/*getter and setters method is used to achieve encapsulation we have to set our state privately
	  and then we have to call getter and setters method this allows us to change value of a private 
	  state variable but not directly its go through with getter and setters and we set getter and 
	  setter publicly so that we can access it in any where. and we can also give a condition
	  for setting a varibale */
	public int getAge() {		//making get method
		return age;
	} 
	public void setAge(int age) {  //making set method
		if(age>20) {				//giving condition for our value.
			System.out.println("you are too old");
		}else {
			this.age=age;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
