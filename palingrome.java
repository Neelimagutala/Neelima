package evenodd;

import java.util.Scanner;

public class palingrome {
	public static void main(String args[]) {
	Scanner object=new Scanner(System.in);
	System.out.println("enter the number");
	int a=object.nextInt();
int p=a;
	int rem = 0;
	int sum=0;
	while(a>0) {
		rem=a%10;
		a=a/10;
		sum=sum*10+rem;
		
	}if(sum==p) {
		System.out.println("the given number is palingrome"+sum);
	}else {
		System.out.println("the given number is not a palindrome"+sum);
	}
	
}

}


