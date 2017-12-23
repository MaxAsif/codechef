import java.util.*;
import java.math.*;
class FLOW016
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i;
		BigInteger A,B,gcd;		
		for (i = 0; i < T ; i++ ) {
			A = BigInteger.valueOf(sc.nextInt());
			B = BigInteger.valueOf(sc.nextInt());
			gcd = A.gcd(B);
			System.out.println(gcd+" "+(A.multiply(B)).divide(gcd));
		}
	}
}