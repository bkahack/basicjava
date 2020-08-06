package nestedForLoops;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int k=1;
			for (int j=1 ; j<=n ;j++) {
				for (int i=1 ; i<=j ; i++) {
					System.out.print(k++ +" " );
				}
			System.out.println( );
			}
	}
}
//floyd's triangle