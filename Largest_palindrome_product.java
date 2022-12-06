
public class Largest_palindrome_product {

	public static boolean palindrome(int num) {
		int reverse=0;
		int x=num;
		while(num>0){
			int rem=num%10;   //extract digits from the number
			reverse=reverse*10+rem;  // reverse the number
			num=num/10;
			
		}
		if(reverse==x) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		int maxi=Integer.MIN_VALUE;
		for(int i=100;i<=998;i++) {     //range for calculating
			for(int j=i+1;j<=999;j++) {
				if(palindrome(i*j)) {   //function to find pallindrome
					maxi=Math.max(max, i*j);   //find the max
				}
			}
		}
		System.out.println(maxi);
	}

}
