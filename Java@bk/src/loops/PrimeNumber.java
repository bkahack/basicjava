package loops;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
System.out.println("Enter any number");
int a =sc.nextInt();
boolean prime=true;
if(a<=1) {
	prime=false;
}
for (int i=2 ; i*i<=a ; i++) {
	if (a % i==0) {
		prime=false;
		break;
	}}
	System.out.println(  prime + " "+  " prime  ");
	
	}

}
