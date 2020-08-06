package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter dimension");
		int rows=sc.nextInt();
		int colms=sc.nextInt();
		int [][]matA= new int[rows] [colms];
		System.out.println("ENter array 1");
		for(int i= 0 ; i<rows ; i++)
		{
			for(int j=0 ; j<colms ; j++) {
				matA [i][j]=sc.nextInt();
			}
		}
		int [][]matB= new int[rows] [colms];
		System.out.println("Enter array 2");
		for(int i= 0 ; i<rows ; i++)
		{
			for(int j=0 ; j<colms ; j++) {
				matB [i][j]=sc.nextInt();
			}
		}
		int [][] matC = new int [rows][colms];
		for(int i= 0 ; i<rows ; i++)
		{
			for(int j=0 ; j<colms ; j++) {
		 matC[i][j]=matA[i][j] +matB[i][j];
			}
			}
		System.out.println("result");
		for(int i= 0 ; i<rows ; i++)
		{
			for(int j=0 ; j<colms ; j++) {
				System.out.print(matC[i] [j]);
			}System.out.println();
		}
		}

}
