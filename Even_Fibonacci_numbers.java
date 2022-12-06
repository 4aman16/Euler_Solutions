
public class Even_Fibonacci_numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take a limit of 4000000
		int limit=4000000;
		int a=1;
		int b=2;
		int sum=2;
		int c=a+b;
		while(c<limit) {   //loop to find the solution
			a=b;
			b=c;
			c=a+b;
			if(c%2==0)
				sum+=c;
		}
		System.out.println(sum);   //print the sum
	}

}
