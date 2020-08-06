package matrix;

import java.util.Scanner;

public class AdditionOfTwoSquareMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int a[][]=new int [N][N];
		    int b[][]=new int [N][N];
		    for(int i=0 ; i<N;i++){
		        for (int j=0 ;j<N ;j++){
		            a[i][j]=sc.nextInt();
		        }
		    }
		    for(int i=0 ; i<N;i++){
		        for (int j=0 ;j<N ;j++){
		            b[i][j]=sc.nextInt();
		        }
		    }
		    int c[][]=new int[N][N];
		    for(int i=0 ; i<N;i++){
		        for (int j=0 ;j<N ;j++){
		            c[i][j]=a[i][j] +b[i][j];
		        }
		    } 
		    for(int i=0 ; i<N;i++){
		        for (int j=0 ;j<N ;j++){
		           System.out.print(c[i][j] + " ");
		        }
		    }
		    System.out.println();
		}
	}
}


/*Write a program to add two matrices.

Input
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test contains an integer N denoting the size of the square matrix. 
Then the two square matrix of size N*N is taken as input in next two lines.

Output:
For each test case in a new line print separated values of the matrix denoting addition of 
the two matrices.
 

Constraints:
1<=T<=100
1<=N<=20
1<=a[i][j]<=1000

Example:
Input:
2
4
1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4
1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4
2
1 2 3 4
3 4 2 1

Output:
2 2 2 2 4 4 4 4 6 6 6 6 8 8 8 8 
4 6 5 5*/