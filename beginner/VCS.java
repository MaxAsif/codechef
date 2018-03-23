import java.util.*;
class VCS
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,j,k,N,M,K,ctr1=0,ctr2=0,flag1,flag2;

		for (i=0;i<T ;i++ ) {
			N = sc.nextInt();
			M = sc.nextInt();
			K = sc.nextInt();
			int no[] = new int[N+1];
			for (j=1;j<=N ;j++ ) {
				no[j]=0;
			}
			ctr1=0;
			ctr2=0;
			for (j = 0; j<M ;j++ ) {
				no[sc.nextInt()]++;
			}
			for (j = 0; j<K ;j++ ) {
				no[sc.nextInt()]++;
			}
			for (k=1;k<=N ;k++ ) {
				if(no[k]==2)
					ctr1++;
				else if(no[k]==0)
					ctr2++;
			}
			System.out.println(ctr1+" "+ctr2);
		}
	}
}