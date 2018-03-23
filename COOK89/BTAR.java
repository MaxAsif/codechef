import java.util.*;
class BTAR
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n,i,j,ctr1=0,ctr2=0,ctr3=0,no,sum=0,count=0;
		for (i = 0;i < T ;i++ ) {
			n = sc.nextInt();
			sum=0;
			ctr1=0;
			ctr2=0;
			ctr3=0;
			count=0;
			for (j = 0; j<n ;j++ ) {
				no = sc.nextInt();
				sum+=no;
				if(no%4==1)
					ctr1++;
				else if(no%4==2)
					ctr2++;
				else if(no%4==3)
					ctr3++;
			}
			//System.out.println(ctr1+" "+ctr2+" "+ctr3);
			if(sum%4!=0)
			{
				System.out.println(-1);
			}
			else
			{
				if(ctr1==ctr3){
					count+=ctr1;
					count+=ctr2/2;
				}
				else if(ctr1<ctr3){
					count+=ctr1;
					ctr3 = ctr3-ctr1;
					count = count + (ctr3/2);
					ctr2 = ctr2 - ctr3/2;
					count+=ctr2/2;
				}
				else if(ctr1>ctr3){
					count+=ctr3;
					ctr1-=ctr3;
					count = count + (ctr1/2 + ctr2)/2;
				}
				System.out.println(count);
			}
		}
	}
}