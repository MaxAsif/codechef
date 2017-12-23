import java.util.*;
class FLOW010
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i;
		char ch;
		for (i = 0; i < T ; i++ ) {
			ch = sc.next().charAt(0);
			if(ch == 'B' || ch == 'b')
				System.out.println("BattleShip");			
			else if(ch == 'C' || ch == 'c')
				System.out.println("Cruiser");
			else if(ch == 'D' || ch == 'd')
				System.out.println("Destroyer");
			else if(ch == 'F' || ch == 'f')
				System.out.println("Frigate");
		}
	}
}