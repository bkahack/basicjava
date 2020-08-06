package nestedForLoops;

public class TableFrom1to20 {

	public static void main(String[] args) {
		int result =1;
		
		for (int i=1 ; i<=10 ; i++)
		{
			System.out.println( );
			for(int j=1 ; j<=20 ; j++)	
		{ 	
				result=i*j;
				System.out.print( "    "  + result);
		}		
		}
		
			}

}
