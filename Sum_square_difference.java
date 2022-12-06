
public class Sum_square_difference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int ss=0; //sumsquare
		for(int i=1;i<101;i++) {
			sum+=i;//sum of ith number

			ss+=(int) Math.pow(i,2); //compute square
		}
		int diff=(int)Math.pow(sum,2)-ss;  //find the difference 
		System.out.println(diff); // print the sumsquare difference
	}
}
