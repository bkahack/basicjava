package loops;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter base number ");
		int a=sc.nextInt();
		System.out.println("Enter power number");
		int b=sc.nextInt();
		int c=1;
		for(int i=1 ; i<=b ; i++)
		{
		c=a*c;	
		}
System.out.println("Power of two number is "  + c);
	} 

}
