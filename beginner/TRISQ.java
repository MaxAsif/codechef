import java.util.*;
class TRISQ
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // No of test cases
		int i,length;
		for (i = 0 ; i < T ; i++ ) {
			 length = sc.nextInt();
			System.out.println(square(length));
		}
	}
	public static int square(int l)
	{
		if(l<=2)
			return 0;
		else
			return (l-2)/2 + square(l-2);
	}

}