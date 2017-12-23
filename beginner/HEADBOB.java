import java.util.*;
class HEADBOB
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,j,n;	
		String str;
		for (i=0;i< T;i++ ) {
			n = sc.nextInt();
			sc.nextLine();
			str = sc.nextLine();
			
			if(str.indexOf('Y')>=0)
				System.out.println("NOT INDIAN");
			else if(str.indexOf('I')>=0)
				System.out.println("INDIAN");
			else
				System.out.println("NOT SURE");
			
			
		}

	}
}