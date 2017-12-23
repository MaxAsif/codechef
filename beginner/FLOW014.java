import java.util.*;
class FLOW014
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,h,ts;
		double cc;
		for (i = 0; i<T ; i++) {
			h = sc.nextInt();
			cc = sc.nextDouble();
			ts = sc.nextInt();
			if(h>50 && cc<0.7 && ts>5600)
				System.out.println(10);
			else if(h>50 && cc<0.7)
				System.out.println(9);
			else if(cc<0.7 && ts>5600)
				System.out.println(8);
			else if(h>50 && ts>5600)
				System.out.println(7);
			else if(h>50 || cc<0.7 || ts>5600)
				System.out.println(6);
			else
				System.out.println(5);

		}
	}
}