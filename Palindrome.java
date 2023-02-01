package evenodd;

public class Palindrome {
	public static void main(String args[]) {
		String a="sun";
		String pal="";
		for(int i=a.length()-1;i>=0;i--) {
			
		pal=pal+a.charAt(i);
				
		}
			System.out.println(pal);
	}

}
