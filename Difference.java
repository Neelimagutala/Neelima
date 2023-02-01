package evenodd;

public class Difference {
	public static void main(String args[]) {
		int a[]= {2,4,5,6,5,8,1,1,3,44,21};
		int sum=0;int sub=0;int diff;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
				
	
			
			}
			else{
				sub=sub+a[i];
				}
			}System.out.println("the even number are"+sum);	

			System.out.println("the odd number are"+sub);	
			diff=sum-sub;
			System.out.println("the difference number are"+diff);	
		
	}

}
