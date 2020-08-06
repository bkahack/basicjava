package matrix;
import java.util.*;
public class SpiralPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0 ; i<r ;i++) {
			for(int j=0 ;j<c ;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		int left=0 ;
		int right=c;
		int up=0;
		int down=r;
		while(left<right && up <down) {
			
			for(int i=left ; i<right ;i++) {
				System.out.print(mat[up][i] +" ");
			}up++;
			
			
			for(int i=up ; i<down ;i++) {
				System.out.print(mat[i][right-1]+" ");
			}right--;
			
			
			for(int i=right-1 ; i>=left ;i--) {
				System.out.print(mat[down-1][i]+" ");
			}down--;
			
			
			for(int i=down-1 ; i >= up ;i--) {
				System.out.print(mat[i][left]+ " ");
			}left++;
			
		}

	}

}
