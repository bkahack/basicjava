package loops;

import java.util.*;
import java.lang.*;
import java.io.*;
class Hi{
    public void swap(int []ar , int a ,int b){
        int temp=ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
    } 
    public void wave(int ar[] ,int n){
        int b=n/2+1;
        for(int i=0; i<n/2-1; i=i+2){
            swap(ar ,i , b);
            b=b+2;
        }
    }
    }
public class Test {
	public static void main (String[] args) {
//	    Scanner sc=new Scanner(System.in);
//	    System.out.println("test case");
//		int T=sc.nextInt();
//		
//		while(T>0){
//			System.out.println("length of arrays");
//		    int N=sc.nextInt();
//		    int[]C=new int[N];
//		    System.out.println("elemet of arrys");
//		    for(int i=0 ;i<N ;i++)
//		        C[i]=sc.nextInt();
//		    
//                for(int j=0 ; j<N ; j++){
//                    for(int k=0; k<N-1-j ; k++){
//                        if(C[k+1]<C[k]){
//                        int temp= C[k+1];
//                        C[k+1]=C[k];
//                        C[k]=temp;
//                        }
//                    }
//                }
//                for(int l=0;l<C.length-2;l++)
//                	System.out.print(C[l] +" ");
//		    T--;
//		}
		Scanner sc=new Scanner(System.in);
		Hi obj=new Hi();
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int A[]=new int[N];
		    for(int i=0 ; i<N ;i++)
		        A[i]=sc.nextInt();
		        Arrays.sort(A);
		        obj.wave(A ,N);
		        for(int e: A){
		            System.out.print(e +" ");
		            
		        }
		     System.out.println();   
		}
	
	}
}