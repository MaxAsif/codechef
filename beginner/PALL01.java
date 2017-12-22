import java.util.*;
class PALL01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,no,rev_no = 0,temp;
		for (i=0;i< T;i++ ) {
			no = sc.nextInt();
			temp = no;
			rev_no = 0;
			while(no > 0)
			{
				rev_no = rev_no*10 + no%10;
				no/=10;
			}
			if(rev_no == temp)
				System.out.println("wins");
			else
				System.out.println("losses");				

		}

	}
}