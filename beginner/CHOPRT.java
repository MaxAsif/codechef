import java.util.*;
class CHOPRT
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,n,m;
		for (i = 0; i<T ; i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			if(n<m)
				System.out.println("<");
			else if(n>m)
				System.out.println(">");
			else if (n==m) {
				System.out.println("=");
			}
		}
	}
}