package scannerInput;
import java.util.Scanner;
public class AreaOFTringle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Base");
	int base =sc.nextInt();
	System.out.println("Enter Height");
	int Height = sc.nextInt();
	int area =( base * Height /2) ;
	System.out.println("Area of circle by given 'console value' =" + area);

	}

}
