package nestedForLoops;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("*");
			for(int i=2 ;i<=a-1;i++)
			{
				System.out.print("* ");
				for(int j=1 ; j<=i-2 ;j++)
				System.out.print("  ");
				System.out.print("*");
				System.out.println();
			}if(a>1)
			for(int j=1 ; j<=a ; j++) {
				System.out.print("* ");
			}
	}

}
