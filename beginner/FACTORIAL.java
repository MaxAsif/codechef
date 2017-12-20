import java.util.*;
class FACTORIAL
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // No of test cases
		int i;
		for (i = 0 ; i < T ; i++ ) {
			int n = sc.nextInt();
			System.out.println(z_function(n,5));
		}
	}
	public static int z_function(int n, int m)
	{
		
		if(n / m == 0)
			return 0;
		else
			return(n/m + z_function(n,m*5));
	}

}