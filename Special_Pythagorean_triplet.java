
public class Special_Pythagorean_triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		for(int i=1;i<=n/3;i++) {   // will go to n/3 numbers of time
			for(int j=i+1;j<=n/2;j++) {    // will go to half the numbers
				int p=n-i-j;
				if(i*i+j*j==p*p) {
					System.out.println(i+" "+j+" "+" "+p);
				}
			}
		}
	}

}
