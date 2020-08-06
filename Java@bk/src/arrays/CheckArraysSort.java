package arrays;

import java.util.Scanner;


class CheckArraysSort {
	public static void main (String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("test case");
			int T=sc.nextInt();
			boolean sorted=true;
			while(T>0){
				System.out.println("length of arrays");
			    int N=sc.nextInt();
			    int[]C=new int[N];
			    System.out.println("elemet of arrys");
			    for(int i=0 ;i<N ;i++)
			        C[i]=sc.nextInt();
			    
			        for(int j=0 ; j<N ; j++){

			            for(int k=0; k<N-1-j ; k++){
			                if(C[k+1]<C[k]){
			                int temp= C[k+1];
			                C[k+1]=C[k];
			                C[k]=temp;
			                sorted =false;
			                break;
			                }
			            }
			        }if(sorted){
			            System.out.println("1");
			        }else{
			            System.out.println("0");
			        }  
			    T--;
			}
		}
	}
}
