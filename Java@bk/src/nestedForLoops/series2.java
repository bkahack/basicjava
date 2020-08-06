package nestedForLoops;
import java.util.Scanner;
public class series2 {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter nth number ");
	float n= sc.nextInt();
	float result=0;
	float result1=0;
	float result2=0;
	for (float i=1 ; i<=n ; i=i+2)
	{	result = result + 1/i;} 
	for (float i=2 ; i<=n ; i=i+2)			 
	{	result1 = result1 + 1/i;}
	result2 = result -result1;
	
System.out.println(result2);
}
}