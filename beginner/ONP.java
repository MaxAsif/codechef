import java.util.*;
class ONP
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int i,j,n;
		char ch;
		String str;
		Stack<Character> st = new Stack();
		for (i=0;i< T;i++ ) {
			str = sc.nextLine();
			for (j = 0; j<str.length() ; j++ ) {
				ch = str.charAt(j);
				if(ch == '/' || ch == '-' || ch == '+' || ch == '*' || ch == '^'  )
					st.push(ch);
				else if(ch == ')' )
					System.out.print(st.pop());
				else if(ch != '(' && ch != ')')
					System.out.print(ch);
			}
			System.out.println();
		}

	}
}