package arrays;

import java.util.Scanner;
public class MatrixMuliplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum=0;
			System.out.println("Enter dimention of matix A  ");
			int Arows=sc.nextInt();
			int Acols=sc.nextInt();
				int [] []matA=new int [Arows][Acols];
				System.out.println("Enter vale of matrix 'A");
					for(int i =0 ; i<Arows ; i++) {
						for(int j=0 ; j<Acols ; j++) {
							matA[i][j]=sc.nextInt();
					}}
			System.out.println("Enter dimention of matix B");
			int Brows=sc.nextInt();
			int Bcols=sc.nextInt();
				int [] []matB=new int [Brows][Bcols];
				System.out.println("Enter value of matrix 'B");
					for(int i =0 ; i<Brows ; i++) {
						for(int j=0 ; j<Bcols ; j++) {
							matB[i][j]=sc.nextInt();
						}
				}
					if(Acols == Brows) {
						int	matC [][] = new int [Arows][Bcols];
						
						for(int i=0 ; i<Arows ; i++) {
							for (int j= 0 ; j<Bcols ;j++){
							for(int k= 0 ; k<Brows ;k++)	{
								sum= sum + matA[i][k]*matB[k][j];
								matC[i][j]=sum;
							}
						}
							}System.out.println("product of matrix");
						for(int i=0 ; i<Arows ; i++) {
								for (int j= 0 ; j<Bcols ;j++){
									System.out.print(matC[i][j] + " ");
								}}
						}else {
						System.out.println("Cols of matrix A !=  Row of matrix B : IT can't multiply");
					}
			}
}