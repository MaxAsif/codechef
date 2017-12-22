import java.util.*;
class FLOW008
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,n;
		for (i=0;i< T;i++ ) {
			n = sc.nextInt();
			if(n<10)
				System.out.println("What an obedient servant you are!");
			else
				System.out.println(-1);				

		}

	}
}