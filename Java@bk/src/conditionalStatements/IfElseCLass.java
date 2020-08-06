package conditionalStatements;

public class IfElseCLass {

	public static void main(String[] args) {
		int noOFPetals =5;
		if(noOFPetals % 2==0) {
			System.out.println("He loves me not");
		 }else {
				System.out.println("He loves me"); // Upper condition is true that's why else don't work.
		}
	}

}
