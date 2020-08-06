package methods;

//when a class have more then one method of same name but different parameters is known as method overloading.


public class Introduction {

	static int maxOF(int a ,int b) {
		if (a>b) {
			return a;
		}else {
		return b;
		}
	}
	static int maxOF(int a ,double b) {
		if (a>b) {
			return a;
		}else {
		return (int)b;
		}
	}
	
	static void sayHI() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}
	public static void main(String[] args) {
		int fN=30;
		int sN=35;
		int result=maxOF(fN,sN);
			System.out.println(result);
			int result1=maxOF(100,100.1);
			System.out.println(result1);
			sayHI();

}}
