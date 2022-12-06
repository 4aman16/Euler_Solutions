
public class Largest_prime_factor {
	public static boolean isPrime(int n) {
		for(int i=2;i*i<=n;i++) {    // check for prime
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long num=600851475143l; //Lrgest number
		int pri=2;
		
		long maximum=Long.MIN_VALUE;
		while(num>1) {
			max=Math.max(maximum, pri);
			while(num%pri==0) {
				num=num/pri;
			}
			pri++;
			while(!isPrime(pri)) { //check prime or not
				pri++;
			}
		}
		System.out.println(maximum); // print he maximum value
	}

}
