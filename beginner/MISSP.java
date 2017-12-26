import java.util.*;
class MISSP
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n,i,j,k,ctr=0;
		for ( i = 0 ; i<T ;i++ ) {
			n = sc.nextInt();
			int a[] = new int[n];
			for (j = 0; j<n ; j++ ) {
				a[j] = sc.nextInt();
			}
			for (j = 0; j < n ; j++ ) {
				ctr = 0;
				for (k=0; k < n ; k++ ) {
					if(a[j] == a[k]){
						ctr++;
						
					}
				}
				if(ctr%2!=0)
					break;
			}
			System.out.println(a[j]);
			
		}
		
		
	}
}