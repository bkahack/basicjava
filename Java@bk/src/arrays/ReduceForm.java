package arrays;
import java.util.*;
public class ReduceForm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int a[]=new int[N];
		    int c[]=new int[N];
		    for(int i=0 ;i<N ;i++){
		        a[i]=sc.nextInt();
		        c[i]=a[i];
		    }
		   Arrays.sort(c);
		   for(int i=0 ;i<N ;i++) {
			   for(int j=0 ;j<N ;j++) {
				   if(a[i]==c[j]) {
					   System.out.print(j+" ");
				   }
			   }
		   }
		   
		   
		System.out.println();
		    
		}
	}
}