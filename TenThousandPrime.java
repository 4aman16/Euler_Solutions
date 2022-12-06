import java.util.*;
public class TenThousandPrime {
	
	boolean[] ch=new boolean[10000000+1];
    public void sieveMethod() {
    	int count=0;
    	int z=-1;
    	for(int i=2;i<=10000000;i++)
    		ch[i]=true;
    	for(int i=2;i<=Math.sqrt(10000000);i++) {
    		if(ch[i]==true) {
        		for(int j=i*i;j<=10000000;j+=i) {
        			ch[j]=false;
        		}    			
    		}
    	}
		for(int i=2;i<=10000000;i++) {
			if(ch[i]==true) {
				count++;
			}
			if(count==10001) {
				z=i;
				System.out.println(z);
				break;
			}
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TenThousandPrime ob=new TenThousandPrime();
		ob.sieveMethod();
	}

}
