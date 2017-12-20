import java.util.*;
import java.math.*;
class FACTORIAL2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // No of test cases
		int i;
		for (i = 0 ; i < T ; i++ ) {
			int n = sc.nextInt();
			System.out.println(fact(BigInteger.valueOf(n)));
		}
	}
	public static BigInteger fact(BigInteger n)
	{
		
		if(n.equals(BigInteger.valueOf(1) ))
			return BigInteger.valueOf(1);
		else
			return(n.multiply(fact(n.subtract(BigInteger.valueOf(1)))));
	}

}