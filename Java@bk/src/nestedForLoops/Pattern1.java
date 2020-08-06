package nestedForLoops;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
			System.out.println("how much number of pattern you want ");
			int a =sc.nextInt();
			for (int i=1 ; i<=a ;i++) {
				System.out.println();
				for (int j = 1;  j<=a ; j++)
				System.out.print( " * ");
					
	}
	}
}
