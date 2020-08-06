package conditionalStatements;

public class NestedTernaryIfElse {

	public static void main(String[] args) {

			int a = 24;
			int b = 25;
			int c = 26;
			int result=0;
			result = a>b ?  a>c ? a :c : b>c? b:c;
			System.out.println("the bigger no is " + result);

	}

} 