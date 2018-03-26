import java.math.BigDecimal;
import java.util.*;
class Solution{

	public static void main(String []args){
        //Input
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String []s=new String[n+2];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		sc.close();
		String temp;
		BigDecimal p,q;
		for(int i=1;i<n;i++)
		{
			temp = s[i];
			p = new BigDecimal(s[i]);
			for(int j=i-1;j>=0;j--){
				q = new BigDecimal(s[j]);
				if(p.compareTo(q)>0){
					s[j+1] = s[j];
				}
				else
					break;
			}
			s[i] = temp;

		}
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}

	}
}