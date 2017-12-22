import java.util.*;
class PRB01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,no,ctr = 0,j;
		for (i=0;i< T;i++ ) {
			no = sc.nextInt();
			ctr = 0;
			for (j = 1; j<=no ;j++ ) {
				if(no%j==0)
					ctr++;
			}
			if(ctr == 2)
				System.out.println("yes");
			else
				System.out.println("no");				

		}

	}
}