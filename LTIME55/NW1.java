import java.util.*;
class NW1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,W,j,pos;
		String S;
		for (i=0;i<T ;i++ ) {
			int a[] = {0,4,4,4,4,4,4,4};
			W = sc.nextInt();
			S = sc.nextLine();
			S = S.substring(1);
			pos = 0;
			if (S.compareTo("mon")==0)
				pos = 1;
			if (S.compareTo("tues")==0)
				pos = 2;
			if (S.compareTo("wed")==0)
				pos = 3;
			if (S.compareTo("thurs")==0)
				pos = 4;
			if (S.compareTo("fri")==0)
				pos = 5;
			if (S.compareTo("sat")==0)
				pos = 6;
			if (S.compareTo("sun")==0)
				pos = 7;
			//System.out.println(S+" "+S.compareTo("mon")+" "+pos);
			for (j=0;j<W-28 ;j++ ) {
				a[pos]++;
				if(pos==7)
					pos=0;
				pos++;
			}
			for (j=1;j<=7 ;j++ ) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}	
}