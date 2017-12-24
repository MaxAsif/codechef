import java.util.*;
class LCH15JAB
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,j,max = 0,total=0,count=0;
		char ch,c;
		String str;
		sc.nextLine();
		for (i = 0;i < T ;i++ ) {
			str = sc.nextLine();
			total = 0;
			max = 0;
			for (c = 'a'; c <='z' ; c++ ) {
				count = 0;
				for (j = 0; j<str.length() ;j++ ) {
					ch = str.charAt(j);
					if(ch == c){
						count++;

					}
				}
				if(count > max)
					max = count;
				total+=count;

			}
			total = total - max;
			//System.out.println("Total : "+total)	
			if(max == total)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		

	}
}