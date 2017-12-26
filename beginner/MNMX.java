import java.util.*;
import java.math.*;
class MNMX
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n,i,j,min=0,temp;
		BigInteger res;
		for ( i = 0 ; i<T ;i++ ) {
			n = sc.nextInt();
			min = sc.nextInt();
			for (j = 1; j<n ; j++ ) {
				temp = sc.nextInt();
				if(temp < min)
					min = temp;
			}
			res = BigInteger.valueOf(min).multiply(BigInteger.valueOf(n-1));
			System.out.println(res);
		}
		
		
	}
}