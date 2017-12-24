import java.util.*;
class CHEFSTLT
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,j,min,max;
		char ch1,ch2;
		String str1,str2;
		sc.nextLine();
		for (i=0;i< T;i++ ) {
			str1 = sc.nextLine();
			str2 = sc.nextLine();
			min = 0;
			max = 0;
			for (j=0;j<str1.length() ;j++ ) {
				ch1 = str1.charAt(j);
				ch2 = str2.charAt(j);
				if(ch1!='?' && ch2!='?' && ch1!=ch2)
					min++;
				else if(ch1=='?' || ch2=='?')
					max++;
			}
			max+=min;
			System.out.println(min +" " + max);
		}

	}
}