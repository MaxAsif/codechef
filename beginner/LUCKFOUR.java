import java.util.*;
class LUCKFOUR
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,ctr =0;
		int no;
		for (i=0;i< T;i++ ) {
			no = sc.nextInt();
			ctr=0;
			while(no>0)
			{
				if(no%10 == 4)
					ctr++;
				no = no/10;
			}
			System.out.println(ctr);
		}

	}
}