import java.util.*;
import java.math.*;
class COMM3
{
	int x,y;
	COMM3()
	{

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,l,ctr = 0,j;
		COMM3 A = new COMM3();
		COMM3 C = new COMM3();
		COMM3 B = new COMM3();
		for (i=0;i< T;i++ ) {
			l = sc.nextInt();
			ctr = 0;
			
			A.x = sc.nextInt();
			A.y = sc.nextInt();
			B.x = sc.nextInt();
			B.y = sc.nextInt();
			C.x = sc.nextInt();
			C.y = sc.nextInt();
			if((A.x - B.x)*(A.x - B.x) + (A.y - B.y)*(A.y - B.y) <= l*l){
				ctr++;
			}
			if((A.x - C.x)*(A.x - C.x) + (A.y - C.y)*(A.y - C.y) <= l*l){
				ctr++;
			}
			if((C.x - B.x)*(C.x - B.x) + (C.y - B.y)*(C.y - B.y) <= l*l){
				ctr++;
			}
			if(ctr >= 2)
				System.out.println("yes");
			else
				System.out.println("no");				

		}

	}
}