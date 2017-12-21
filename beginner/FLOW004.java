import java.util.*;
class FLOW004
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,s = 0;
		int no;
		for (i=0;i< T;i++ ) {
			no = sc.nextInt();
			s = no%10;
			while(no>9)
			{
				no = no/10;
			}
			System.out.println(s+no);
		}

	}
}