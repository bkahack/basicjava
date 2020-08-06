package algorithm.recursion;

import java.util.Scanner;

public class PrintN {
	
	  static void print(int n){
		
	         if(n>0){
		         print(n-1);
	             System.out.print(n +" ");
	             
	         }
	         return;
	         
	       
	         
	     }
		public static void main (String[] args)
		 {
		 Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t-->0){
		     int n=sc.nextInt();
		     print(n);
		 }
		 }
}
