import java.util.*;
class FLOW006
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n,i,s=0;
		for ( i = 0 ; i<T ;i++ ) {
			n = sc.nextInt();
			s = 0;
			while(n>0)
			{
				s = s + n%10;
				n=n/10;
			}
			System.out.println(s);
		}
		
		
	}
}