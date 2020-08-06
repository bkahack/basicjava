package string;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
	
//		String s="heythere";
//		
//		int n=s.length()-1;
//		String reverse="";
//		for(int i=n ; i>=0 ; i--)
//		{
//			char a=s.charAt(i);
//			reverse=reverse+a;							without taking input
//			 
//		}
//		System.out.println(reverse);
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number of Test Cases");
//		int T=sc.nextInt();
//		while(T-->0){
//		 String S=sc.next();
//		 
//		int n=S.length()-1;
//		String reverse="";
//		for(int i=n ; i>=0 ; i--)
//		{
//			char a=S.charAt(i);
//			reverse=reverse+a;
//		}										//with taking user input
//		System.out.println(reverse);
//		
//		}
//	}
//
//}
//		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    String A=sc.next();
		    String rev="";
		   
		    for(int i=A.length()-1 ;i>=0 ;i--){
		 
		    char c=A.charAt(i);
		    
		    rev=rev + c;
		   
		      
		    }
		    System.out.println(rev);
		    if(rev.equals(A)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}