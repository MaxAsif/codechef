import java.util.*;
class REMISS
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,A,B,min=0,max=0;
		for (i=0;i< T;i++ ) {
			A = sc.nextInt();
			B = sc.nextInt();
			min = (A>B) ? A : B;
			max = A + B;
			System.out.println(min+" "+max);
		}

	}
}