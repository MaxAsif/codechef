import java.util.*;
class FLOW005
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,n,q=0;
		for (i=0;i< T;i++ ) {
			n = sc.nextInt();
			q = 0;
			if(n >= 100 )
			{
				q = q + n/100;
				n = n%100;
				
			}
			if(n >= 50 )
			{
				q = q + n/50;
				n = n%50;
				
			}
			if(n >= 10 )
			{
				q = q + n/10;
				n = n%10;
				
			}
			if(n >= 5 )
			{
				q = q + n/5;
				n = n%5;
				
			}
			if(n >= 2 )
			{
				q = q + n/2;
				n = n%2;
				
			}
			if(n >= 1 )
			{
				q = q + n/1;
				n = n%1;
				
			}
			System.out.println(q);
		}

	}
}