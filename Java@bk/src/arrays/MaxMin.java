package arrays;
import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0){
		    int N=sc.nextInt();
		    int []A=new int [N];
		    for(int i=0 ;i<N ;i++)
		         A[i]=sc.nextInt();
		    for(int j=0 ;j<N ;j++){
		        for(int k=0 ; k<N-1-j;k++){
		            if(A[k+1]<A[k]){
		                int temp=A[k+1];
		                A[k+1]=A[k];
		                A[k]=temp;
		            }
		        }
		    }System.out.println(A[0] + " " + A[N-1]);
		    
		    T--;
		}
	}
}
