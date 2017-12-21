import java.util.*;
import java.math.*;
class FSQRT
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,no,sqrt;
		for (i=0;i< T;i++ ) {
			no = sc.nextInt();
			sqrt = (int) Math.sqrt(no);
			System.out.println(sqrt);
		}

	}
}