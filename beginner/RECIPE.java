import java.util.*;
import java.math.*;
class RECIPE
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n,i,j;
		BigInteger d;
		BigInteger no[] = new BigInteger[51];
		for (i=0;i< T;i++ ) {
			n = sc.nextInt();
			for (j=0;j<n ;j++ ) {
				no[j] = BigInteger.valueOf(sc.nextInt());
			}
			d = no[0].gcd(no[1]);
			for (j=1;j<n ;j++ ) {
				d = d.gcd(no[j]);
			}
			for (j=0;j<n ;j++ ) {
				System.out.print(no[j].divide(d)+" ");
			}
			System.out.println();
		}

	}
	
}