import java.util.*;
class generic_return
{
	public static void main(String[] args) {
			System.out.println(max("sdasad","ds","sad")); 
	}
	public static <T extends Comparable<T>> T max(T a, T b, T c){
		if(a.compareTo(b)>0 && a.compareTo(c)>0)
			return a;
		else if(b.compareTo(a)>0 && b.compareTo(c)>0)
			return b;
		else
			return c;
	}
} 