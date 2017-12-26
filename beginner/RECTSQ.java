import java.util.*;
import java.math.*;
class RECTSQ
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i;
		BigInteger l,b,area,area_new;
		for (i=0;i<T ;i++ ) {
			l = BigInteger.valueOf(sc.nextInt());
			b = BigInteger.valueOf(sc.nextInt());
			area = l.multiply(b);
			area_new = (l.gcd(b)).multiply(l.gcd(b));
			System.out.println(area.divide(area_new));
		}
	}
}