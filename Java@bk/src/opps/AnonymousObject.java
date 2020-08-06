package opps;
class Factorial{
	int n;
	String name;
	public void fact(int n) {
		int j=1;
		for(int i=1 ; i<=n ;i++) {
			j=j*i;
		}
		System.out.println(j);
	}
}
/* anonymous object means without creating reference variable(object)
 * by simply giving 'new' keyword and constructor
 */
public class AnonymousObject {

	public static void main(String[] args) {
		new Factorial().fact(5);  //calling method with anonymous object
		
		System.out.println(new Factorial().n=3);
		System.out.println(new Factorial().name);
	}

}
