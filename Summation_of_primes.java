
public class Summation_of_primes {
	public static boolean isPrimecheck(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {  
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long totsum=0;
		for(int i=2;i<2000000;i++) {
			if(isPrimecheck(i)==true) {  //check for prime or not
				totsum+=i; //if prime sum it
			}
		}
		System.out.println(totsum); // print the sum of prime till 2000000
	}

}
