package conditionalStatements;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2000;
		if(((a%4==0 )&& (a%100!=0)) ||( a%400==0)) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year");
		}
	}

}
