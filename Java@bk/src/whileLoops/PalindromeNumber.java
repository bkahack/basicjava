package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while (temp>0) {
			int x=temp%10;
			sum=sum*10 +x;
			temp/=10;
		}
			if(sum==n)
			{
				System.out.println("PalindromeNUmber");
			}
			else {
				System.out.println("NotPalindromeNumber");
			}
	}

}
