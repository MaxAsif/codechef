import java.util.*;
class SMPAIR
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,j,n;
		
		for (i=0;i< T;i++ ) {
			n = sc.nextInt();
			int a[] = new int[n];
			for (j = 0; j<n ; j++) {
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			
			System.out.println(a[0]+a[1]);
		}

	}
}