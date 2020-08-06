package arrays;

public class LinerSearch {
	static int linerSearch(int []a ,int b) {
		for(int i=0 ; i<a.length ; i++) {
			if(b==a[i]) {
				return i;}
		}return -1;
	}
public static void main(String[] args) {
	int[] a= {9,3,5,4,-4,7,0};
	int n=a.length;
	int key=5;
	for(int e:a) {
	System.out.print(e + " ");
	}
	System.out.println();
	System.out.println(key+ " is found at index : " +linerSearch(a , key));
	System.out.println(88+ " is found at index : " +linerSearch(a , 88));
}

}
