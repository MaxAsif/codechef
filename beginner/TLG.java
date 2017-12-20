import java.util.*;
class TLG
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i, A = 0, B = 0, W = 0,Lead, LeadMax = 0;
		for (i=0;i<N ;i++ ) {
			A = A + sc.nextInt();
			B = B + sc.nextInt();
			Lead = (A>B)? A-B : B-A;
			if(Lead > LeadMax) {
				W = (A>B) ? 1 : 2;
				LeadMax = Lead;
			}
		}
		System.out.println(W + " " + LeadMax );
	}
}