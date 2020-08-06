package nestedForLoops;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rows=a*2-1;
		for(int i =1 ; i<=rows ; i++)
		{
			if(a<=i) 
			for(int j=1 ; j<= i ;j++) {
				System.out.print("* ");
			}else
				for (int j= a-1 ; j<=rows-i+1; j++)
				{
					System.out.print("* ");
					}
			System.out.println();
		}
	  }
	}

