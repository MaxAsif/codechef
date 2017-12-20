import java.util.*;
class PERMUT2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i,pos = 0,flag = 0;
		String str = "";
		char ch;
		do{
			flag = 0;
			str = "";
			n = sc.nextInt();
			if(n==0)
				break;
			for(i=1;i<=n;i++)
			{
				str = str + sc.next().charAt(0);
			}
			//System.out.println(str);
			for (i=1;i<=n ;i++ ) {
				pos = str.indexOf((char)(i + 48)) + 1;
				//System.out.println("i : "+i + " pos : " + pos );
				//System.out.println("charAt(i-1)"+str.charAt(i-1) + " (char)(pos+48) : " + (char)(pos+48) );
				if(str.charAt(i-1)==(char)(pos+48))
					flag = 0;
				else 
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				System.out.println("ambiguous");
			else
				System.out.println("not ambiguous");
		}
		while(n > 0);
		
		
	}
}