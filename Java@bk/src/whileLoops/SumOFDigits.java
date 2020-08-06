package whileLoops;
import java.util.Scanner;
public class SumOFDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n= sc .nextInt();
		
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			int outcome=temp%10;
			sum=sum + outcome;
			temp=temp/10;	
		}System.out.println("sum is " + sum );
	}

}
