package loops;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int T=sc.nextInt();
		while (T-->0){
		    int N=sc.nextInt();
		    int a=0;
		    int b=1;
		    int sum=0;
		    int ar[]=new int[13];
		    ar[0]=0;
		    ar[1]=1;
		    for(int i=2 ; i<13 ;i++){
		        sum=a+b;
		        int temp=sum;
		        ar[i]=temp;
		        a=b;
		        b=temp;
		        
		    }for(int e: ar) {
		    	System.out.print(e+" ");
		    }
		    boolean fibo=false;
		    for(int j=0 ;  j<13 ;j++){
		        if  (ar[j]==N){
		            fibo=true;
		            break;
		        }
		    }
		    if(fibo==true){
		    System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		}
	}
}