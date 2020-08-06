package string;

public class Anagrams {

	public static void main(String[] args) {
		String a="cat";
		String b="act";
		boolean []visited= new boolean[b.length()];
		boolean isAnagrams=false;
				if(a.length() == b.length()) {
				
					for(int i=0 ;i<a.length() ;i++) {
						char c=a.charAt(i);
						isAnagrams=false;
						for(int j=0 ; j<b.length() ; j++) {
							if(b.charAt(j)==c && !visited[j]) {
								isAnagrams=true;
								break;
							}
							}
				if(!isAnagrams) {
					break;}
					}
						}if(isAnagrams) {
							System.out.println("Anagrams");
								}else {
									System.out.println("Not Anagrams");
								}
					}		
	}