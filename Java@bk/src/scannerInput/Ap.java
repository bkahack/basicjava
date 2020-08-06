package scannerInput;
import java.util.Scanner;
public class Ap {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Entre first no of AP");
	int x=sc.nextInt();
	System.out.println("Entre Second no of AP");
	int y=sc.nextInt();
	System.out.println("which nth term you want to find");     // this question is ask in hacker earth but test case is also there
	int t=sc.nextInt();
	int z= y - x ;
	long ap = x + (t-1)*z ;
	System.out.println("AP of the given 'console term' = " + ap);

	}

}
