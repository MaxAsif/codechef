import java.util.*;
class GDOG
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,N,K,max,j;
		for (i = 0; i < T ; i++ ) {
			N = sc.nextInt();
			K = sc.nextInt();
			max = 0;
			for (j = 1;j<=K ;j++ ) {
				if (N%j > max) {
					max = N%j;
				}
			}
			System.out.println(max);
		}
	}
}