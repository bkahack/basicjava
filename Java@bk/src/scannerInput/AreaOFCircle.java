package scannerInput;
import java.util.Scanner;
public class AreaOFCircle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter radius");
		float radius = sc.nextFloat();
		double area = radius*radius*3.14;
		System.out.println("Area of circle by given 'console value'=" + area);
		
		

	}

}
