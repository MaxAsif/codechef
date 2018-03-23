import java.util.*;
import java.math.*;
class RECTANGL
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,a,b,c,d;
		for (i=0;i<T ;i++ ) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			if(a==b && c==d)
				System.out.println("YES");
			else if(a==c && b==d)
				System.out.println("YES");
			else if(a==d && b==c)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}