import java.util.*;
import java.math.*;
class FLOW018
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,n,j;
		BigInteger F = BigInteger.valueOf(1);
		for (i=0;i< T;i++ ) {
			n = sc.nextInt();
			 F = BigInteger.valueOf(1);
			for (j = 1; j<=n ; j++ ) {
				F = F.multiply(BigInteger.valueOf(j));
			}
			System.out.println(F);
		}

	}
}