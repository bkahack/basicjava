package loops;

import java.util.Scanner;

public class FibonacciPositionNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    long N=sc.nextInt();
		    long result=0;
		    if(N==0){
		        System.out.print("0");
		    }
		    if(N==1){
		        System.out.println("1");
		    }else if(N ==2){
		        System.out.println("1");
		    }else if(N>2){
		    long a=1;
		    long b=1;
		   
		    
		  
		    for(int i=2 ; i<N ;i++){
		               result=a+b;
		               long temp=result;
		               a=b;
		               b=temp;
		             }
		         
		         System.out.println(result%1000000007);
		        
		    }
		    } 
		}
	}