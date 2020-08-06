package loops;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int ans=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1 ; i<=n ;i++) {
			int a=2;
			for(int j=1 ; j<=i ;j++) {
				
				 ans+=a;
				 a=a+2;
			}	
		}
		System.out.println(ans);
	}

}
// adda