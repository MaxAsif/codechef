import java.util.*;
class FLOW011
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i,bs;
		double hra,da,gross;
		for (i = 0; i<T ; i++) {
			bs = sc.nextInt();
			if(bs<1500){
				hra = .1*bs;
				da = .9*bs;
			}
			else{
				hra = 500;
				da = .98*bs;
			}
			gross = bs + da + hra;
			System.out.printf("%.2f\n",gross);
		}
	}
}