import java.util.*;

class CIELRCPT
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i;
		int p;
		for (i=0;i<T ;i++ )
		{
			p = sc.nextInt();
			System.out.println(frequency(p,2048));			
		}
	}
	public static int frequency(int p, int i)
	{
		if(p == 0)
			return 0;
		else
		{
			return (p/i + frequency(p%i, i/2));
		}
	} 
}