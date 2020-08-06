package arrays;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter no of student :");
			int a=sc.nextInt();
			int [] marks =new int [a];
			System.out.println("Enter marks :");
			for(int i=0; i<a ; i++)
			{
				marks[i]=sc.nextInt();
			} 
			int avg=0;
			for (int i=0 ; i<a ; i++) {
				avg +=marks[i]; 
				}
			avg /=a;
			System.out.println("Average marks of student is :" + avg);
		}
}
