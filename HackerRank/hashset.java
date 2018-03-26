import java.util.*;
class hashset
{
	public static void main(String[] args) {
		String[] things = {"a","b","S","a"};
		List<String> l = Arrays.asList(things);
		System.out.printf("List : %s\n", l);
		Set<String> set = new HashSet<String>(l);
		System.out.printf("Set : %s\n", set);
	}
}