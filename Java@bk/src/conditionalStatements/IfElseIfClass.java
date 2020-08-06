package conditionalStatements;

public class IfElseIfClass {

	public static void main(String[] args) {
		int number =23;
		if (number <=10) {
			System.out.println("Number is less then 10");
		} else if( number >10 && number<=20) {
			System.out.println("Number is greater then 10 and less then 20");
			
		} else if(number >20 && number <=30) {
			System.out.println("Number is greater then 20 and less then 30");
			
		} else {
			System.out.println("Number is greater then 30");
		}

	}

}
