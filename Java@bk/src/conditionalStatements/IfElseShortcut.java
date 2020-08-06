package conditionalStatements;

public class IfElseShortcut {
	public static void main(String[] agrs) {
		int a=15;
		int b=8;
		int maxOfBothNmbers=0;
		
		maxOfBothNmbers = a > b ? a:b;  			// Ternary Operator
		
		System.out.println("Max of both Number is " + maxOfBothNmbers);
	}

}
