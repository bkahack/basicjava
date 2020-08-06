package arrays;
 


import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class GFGArraysElementLessTwo{
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("test case");
		int T=sc.nextInt();
		
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
                        }
                    }
                }
                for(int l=0;l<C.length-2;l++)
                	System.out.print(C[l] +" ");
		    T--;
		}
	}
}