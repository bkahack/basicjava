package arrays;
class Wave{
	void sort(int ar[] ,int a ,int b) {
		int temp=ar[a];
		ar[a]=ar[b];
		ar[b]=temp;
	}
	void waveType(int ar[] , int n) {
		for(int i=0 ;i<n-1 ;i=i+2) {
			sort(ar ,i , i+1);
		}
	}
}

public class WaveForm{

public static void main(String[] args) {
		Wave obj=new Wave();
		int arr[]= {1,2,3,4,5,6,7,8};
		int n=arr.length;
		obj.waveType(arr ,n);		
		for(int e :arr) {
			System.out.print(e + " ");
			}
	}
}
/*	Given a sorted array arrays[] of non-repeating integers without duplicates.
Sort the array into a wave-like array and return it. In other words, arrange the elements
 into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... 
 (considering the increasing lexicographical order).

			Input:
			The first line contains an integer T, depicting total number of test cases.
			 T testcases follow. The first line of each testcase contains
			  an integer N depicting the size of the array.
			   The second line contains N space separated elements of the array.

			Output:
			For each testcase, in a new line, print the array into wave-like array.

			Constraints:
			1 ≤ T ≤ 100
			1 ≤ N ≤ 106
			0 ≤ A[i] ≤107

			Example:
			Input:
			1
			5
			1 2 3 4 5
			Output:
			2 1 4 3 5

			Explanation:
			Testcase 1: Array elements after sorting it in wave form are 2 1 4 3 5. */