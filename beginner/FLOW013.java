import java.util.*;
class FLOW013
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,n,A,B,C;
		for (i=0;i< T;i++ ) {
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			if(A+B+C == 180 && A>0 && B>0 && C>0)
				System.out.println("YES");
			else
				System.out.println("NO");				

		}

	}
}