package evenodd;

import java.util.Scanner;

public class Sumofdigit {
	public static void main(String args[]) {
		Scanner object=new Scanner(System.in);
		System.out.println("enter the number");
		int a=object.nextInt();
int count=0;
		int rem = 0;
		int sum=0;
		while(a>0) {
			rem=a%10;
		
			a=a/10;
			count++;
			sum=sum+rem;
			
		}System.out.println("the given numbers"+sum);
		System.out.println("th total no of digits"+count);
	}

}
