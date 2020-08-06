package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=18;
		int b=13;
		int c=20;
		int result=0;
		if (a>b) {
				if (a>c) {
				result=a;
				}	else {
					result =c;
					}
				}else {
					if (b > c) {
						result = b;
					}	else { result =c;
				}
		}
		System.out.println("largest of all the number is " + result);
	}

}
