import java.util.*;
class FLOW007
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,s = 0;
		int no;
		for (i=0;i< T;i++ ) {
			no = sc.nextInt();
			s = 0;
			while(no>0)
			{
				s = s*10 + no%10;
				no = no/10;
			}
			System.out.println(s);
		}

	}
}