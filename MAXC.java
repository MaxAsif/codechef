import java.util.*;
import java.math.*;
class MAXC
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,n,j,no,k,sum,pos=0;
		for (i=0;i<T ;i++ ) {
			n = sc.nextInt();
			Integer a[][] = new Integer[n][n];
			for (j=0; j<n; j++) {
				for (k=0; k<n;k++ ) {
					a[j][k] = sc.nextInt();
				}
				Arrays.sort(a[j],Collections.reverseOrder());
			}
			sum = 0;
			sum+=a[n-1][0];
			no = a[n-1][0];
			a :
			for (j=n-2;j>=0 ;j-- ) {
				
				pos = 0;
				for (k=0;k<n && pos<n ;k++ ) {
					if(a[j][pos]< no){
						sum+=a[j][pos];
						no = a[j][pos];
						continue a;
					}
					else 
						pos++;
				}
				if(pos==n){
					System.out.println(-1);
					break;
				}
			};
			if(pos==n)
				System.out.println(-1);
			else
				System.out.println(sum);
		}
	}
}