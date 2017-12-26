import java.util.*;
class CHN09
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int i,ctr1,ctr2;
		String str;
		char ch;
		for (i=0;i<T ;i++ ) {
			str = sc.nextLine();
			ctr1=0;
			ctr2=0;
			
			for (int j=0;j<str.length() ;j++ ) {
				ch=str.charAt(j);
				if(ch=='a')
					ctr1++;
				else
					ctr2++;
			}
			
			if(ctr1>ctr2)
				System.out.println(ctr2);
			else
				System.out.println(ctr1);
		}
	}
}