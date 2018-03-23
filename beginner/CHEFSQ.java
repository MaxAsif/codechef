import java.util.*;
class CHEFSQ
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,N,F,j;
		String seq,fav;
		for (i=0;i<T ;i++ ) {
			seq="";
			fav="";
			N = sc.nextInt();		
			for (j=0;j<N ;j++ ) {
				seq = seq + sc.nextInt()+".";
			}			
			F = sc.nextInt();
			for (j=0;j<F ;j++ ) {
				fav = fav + sc.nextInt()+".";
			}
			if(seq.contains(fav))
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}
}