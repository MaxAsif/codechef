import java.util.*;
class FLOW002
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A,B;
		for (int i = 0 ; i<T ;i++ ) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A%B);
		}
		
		
	}
}