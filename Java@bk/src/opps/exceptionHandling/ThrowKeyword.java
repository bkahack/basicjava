package opps.exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		fun1();
		System.out.println("hi");
		
	}
	static void fun1() {
		
		int a=5;
		int b=3;
		int c=a/b;
		System.out.println(c);
		boolean isDanger=true;
		try {
		fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage() +" occured");
		}
}
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger=true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
	}
}
