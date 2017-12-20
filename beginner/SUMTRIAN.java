import java.util.*;

class SUMTRIAN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,n,j,k,max;
		int a[][] = new int [101][101];
		for (i = 0; i < T ; i++) {
			max = 0;
			n  = sc.nextInt();
			for (j=1;j<=n ;j++ ) {
				for (k=1;k<=j ;k++ ) {
					a[j][k] = sc.nextInt();					
				}
				for (;k<=n ;k++ ) {
					a[j][k] = 0;				
				}
			}
			for (j=2;j<=n ;j++ ) {
				for (k=1;k<=j ;k++ ) {
					if(k==1)
					{
						a[j][k] = a[j][k] + a[j-1][k];	
					}
					else if(j==k)
					{
						a[j][k] = a[j][k] + a[j-1][k-1];
					}
					else
					{
						if(a[j-1][k-1] > a[j-1][k])
							a[j][k] = a[j][k] + a[j-1][k-1];
						else
							a[j][k] = a[j][k] + a[j-1][k];
					}					
				}
			}
			max = a[n][1];
			for(j=1;j<=n;j++)
			{
				max = (a[n][j]>max)? a[n][j] : max ;
			}
			System.out.println(max);
		}
	} 
}	
/*

1
2 1
1 2 3

1
3 2
4 5 5
*/