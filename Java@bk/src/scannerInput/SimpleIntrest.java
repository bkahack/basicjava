package scannerInput;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	System.out.println("Enter Principal");	
	int principal=sc.nextInt();
	System.out.println("Enter Rate");
	float rate =sc.nextFloat();
	System.out.println("Enter Time");
	int time=sc.nextInt();
	double Si=principal *rate *time /100 ;
	System.out.println("Simple Intrest by the given 'console value' =" + Si);
	
	}
	

}
