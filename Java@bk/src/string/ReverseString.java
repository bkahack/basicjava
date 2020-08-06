package string;

public class ReverseString {

	public static void main(String[] args) {
		String s="     hey     there i m prashant     ";
		int n=s.length()-1;
		String ans="";
		int i=n;
		while(i>=0) {
			while(i>=0 && s.charAt(i) ==' ')i--;
			int j=i;
			if(i<0) break;
			while(i>=0 && s.charAt(i) !=' ')i--; 
				if(ans.isEmpty()) {
				ans=ans.concat(s.substring(i+1, j+1));
				}else {
				ans=ans.concat(" "+s.substring(i+1, j+1));
				}
			}
		
		
		System.out.println(ans);
		
	}

} 