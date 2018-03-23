import java.util.*;
class FBMT
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,team1=0,team2=0,j,n;
		String temp="",tmp2="",t;
		for (i = 0; i<T ; i++ ) {
			n = sc.nextInt();
			sc.nextLine();
			team1=0;
			team2=0;
			temp="";
			tmp2="";
			//String str[] = new String[n];
			for (j = 0; j<n ;j++) {
				//str[j] = sc.nextLine();
				t = sc.nextLine();
				if(j==0){
					temp = t;
					team1++;
				}
				else{
					if(t.compareTo(temp)==0)
						team1++;
					else
					{
						tmp2=t;
						team2++;
					}
				}
			}
			
			if(team1>team2)
				System.out.println(temp);
			else if(team2>team1)
				System.out.println(tmp2);
			else
				System.out.println("Draw");
 
		}
	}
} 