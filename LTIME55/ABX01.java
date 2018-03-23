import java.util.*;
import java.math.*;
class ABX01
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,j;
		BigInteger A,N,no;
		
		for (i=0;i<T ;i++ ) {
			A = BigInteger.valueOf(sc.nextInt());
			N = BigInteger.valueOf(sc.nextInt());
			no = A.pow(N.intValue());
			if(no.mod(BigInteger.valueOf(9))==BigInteger.valueOf(0))
				no = BigInteger.valueOf(9);
			else
				no = no.mod(BigInteger.valueOf(9));

			System.out.println(no);	
		}
	}/*
	public static BigInteger pow(BigInteger a,BigInteger b)
	{
		if ( b == BigInteger.valueOf(0))        return BigInteger.valueOf(1);
		if ( b == BigInteger.valueOf(1))        return a;
		if (b.mod(BigInteger.valueOf(2))==BigInteger.valueOf(0))    return     pow ( a.multiply(a), b.divide(BigInteger.valueOf(2))); 
		else                return a.multiply( pow ( a.multiply(a), b.divide(BigInteger.valueOf(2))));

	}*/

} 