import java.util.*;
class PERMUT2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i,pos = 0,flag = 0;
		int a[] = new int[100001];
		char ch;
		do{
			n = sc.nextInt();
			if(n == 0)
				break;
			for (i=1;i<=n ; i++ ) {
				a[i] = sc.nextInt();
			}
			for (i=1;i<=n ; i++ ) {
				if(a[a[i]] == i)
					flag = 0;
				else{
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
				System.out.println("ambiguous");
			else
				System.out.println("not ambiguous");
		}
		while(n > 0);
		
		
	}
}