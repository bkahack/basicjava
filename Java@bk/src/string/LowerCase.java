package string;

import java.util.Scanner;


class LowerCase {

	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
			
			sc.nextLine();
		for (int i=0; i<test ; i++){
		    String S=sc.next();
	    
		    System.out.println(S.toLowerCase());
		}
	}
}