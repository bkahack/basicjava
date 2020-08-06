package loops;
import java.util.Scanner;
public class ForSumOfNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter 'N' number of which you want to find Arthematic sum");
		int n =sc.nextInt();
		int	sum = 0;								
	
		for (int i=1 ; i<=n ;i++) {
			sum = sum + i;
		}
		System.out.print("The arthemetic sum of given 'n'  = " + sum );
	}
	

}
