import java.util.*;
class inputtest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int i, m, ctr=0;
		for (i = 0; i < n ; i++ )
		{
			m = sc.nextInt();
			if(m % k == 0)
				ctr++;

		}
		System.out.println(ctr);
	}
}