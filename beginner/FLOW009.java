import java.util.*;
class FLOW009
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,q,amt;
		double total = 0.000000;
		for (i=0;i<T ;i++ ) {
			q = sc.nextInt();
			amt = sc.nextInt();
			if(q>1000)
			{
				total = 0.9 * q * amt;
			} 
			else
				total = q * amt;
			System.out.printf("%.6f\n",total);
		}
	}
}