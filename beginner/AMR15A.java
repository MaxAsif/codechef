import java.util.*;
class AMR15A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,even=0,odd=0;
		for (i = 0;i<n ;i++ ) {
			if(sc.nextInt()%2==0)
				even++;
			else
				odd++;			
		}
		if(even > odd)
			System.out.println("READY FOR BATTLE");
		else
			System.out.println("NOT READY");

	}
}