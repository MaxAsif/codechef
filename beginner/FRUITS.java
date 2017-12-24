import java.util.*;
import java.math.*;
class FRUITS
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,N,M,K;
		for (i=0;i< T;i++ ) {
			N = sc.nextInt();
			M = sc.nextInt();
			K = sc.nextInt();
			if(Math.abs(N-M)>K)
				System.out.println(Math.abs(N-M)-K);
			else
				System.out.println(0);

		}

	}
}