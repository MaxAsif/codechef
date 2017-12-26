import java.util.*;
import java.math.*;
class TRICOIN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i;
		BigInteger N,j=BigInteger.valueOf(1),sum=BigInteger.valueOf(0);
		for (i=0;i<T ;i++ ) {
			N = BigInteger.valueOf(sc.nextInt());
			j=BigInteger.valueOf(1);
			while (true){
				sum = j.multiply(j.add(BigInteger.valueOf(1)));
				sum = sum.divide(BigInteger.valueOf(2));
				
				if(sum.compareTo(N)==0)
				{
					System.out.println(j);
					break;
				}
				else if(sum.compareTo(N)>0)
				{
					System.out.println(j.subtract(BigInteger.valueOf(1)));
					break;
				}
				j = j.add(BigInteger.valueOf(1));
			}
		}
	}
}