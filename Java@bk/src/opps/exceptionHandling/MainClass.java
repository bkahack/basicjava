package opps.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		try {
		int a=5;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage() + " Please check your code");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index should be in range 0 to length-1");
		}
		finally {
			System.out.println("sorry for the inconvenience");
		} 				//the finally keyword always run even if u have multiple catch
		System.out.println("Very Important code");
		System.out.println("It must run");
	//	fun1 ();
	}
		static void fun1() {
			
				int a=5;
				int b=0;
				int c=a/b;
				System.out.println(c);
				
		}
}
