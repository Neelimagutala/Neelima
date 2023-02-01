package evenodd;

import java.util.Scanner;

public class Repeated {
	public static void main(String args[]) {
	Scanner object=new Scanner(System.in);
	System.out.println("enter the number");
	int a=object.nextInt();

	int rem =0;
	
	while(a>0) {
		rem=a%10;
		a=a/10;
		
		
	}System.out.println("the given numbers"+rem);
	
}

}


