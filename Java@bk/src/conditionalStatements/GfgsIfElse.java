package conditionalStatements;
import java.util.Scanner;


class GfgsIfElse {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0 ; i<test ; i++)
		{
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    if(m==n){
		        System.out.println("equal");
		    }else{
		        if(m>n){
		            System.out.println("greater");
		        }else{
		            System.out.println("lesser");
		        }
		    }
		    }
		    
		}
	}
