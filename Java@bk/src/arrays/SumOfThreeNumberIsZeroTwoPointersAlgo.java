package arrays;

import java.util.*;

public class SumOfThreeNumberIsZeroTwoPointersAlgo {
		
		public static boolean triplet(int ar[] ,int N) {
			Arrays.sort(ar);
			for(int i=0 ;i <N-2 ; i++) {
				if( twoSum(ar ,-ar[i] ,i+1))
				return true;
			}
			
			return false;
		}
		public static boolean twoSum(int ar[] ,int X , int i) {
			int j=ar.length-1;
			while(i<j) {
				
				if( ar[i]+ar[j] < X) { i++ ;}
				else if(ar[i] + ar[j] > X) { j-- ;}
				else {
					return true;
					}
			}
			return false;
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int ar[]=new int[N];
			for(int i=0 ;i<N ;i++)
				ar[i]=sc.nextInt();
			
				boolean c=triplet(ar ,N);
				if (c) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
				
		}
	}

}
