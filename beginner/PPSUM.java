import java.util.*;
class PPSUM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,N,D;
		for (i = 0;i < T ;i++ ) {
			D = sc.nextInt();
			N = sc.nextInt();
			System.out.println(sum(D,N));
		}
	}
	public static int sum(int D,int N)
	{
		if (D == 1) {
			return (N*(N+1)/2);
		}
		else
			return sum(D-1,(N*(N+1)/2));
	}
}