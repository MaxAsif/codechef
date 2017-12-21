import java.util.*;
class FLOW017
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,A,B,C,min,max;
		for (i=0;i< T;i++ ) {
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			max = Math.max(A, Math.max(B, C));
			min = Math.min(A, Math.min(B, C));
			System.out.println(A+B+C-min-max);
		}

	}
}