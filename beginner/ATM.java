import java.util.*;
class ATM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x;
		double y;
		x = sc.nextInt();
		y = sc.nextFloat();
		if((x%5 == 0)&& (x + .5 < y))
		{
			y = y - x - .5;
		}
		System.out.println(y);
	}
}