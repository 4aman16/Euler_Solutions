
public class Multiples_of_three_or_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<1000;i++) {
			if(i%3==0 || i%5==0)   // either divisible by 3 or divisible by 5
			//then sum all the i's
				sum+=i;
		}
		System.out.println(sum);
	}

}
