import java.util.*;
class sort
{
	public static void main(String[] args) {
		String[] str = {"0.11","2","2.0",".11","1"};
		List<String> l = Arrays.asList(str);
		Collections.sort(l);

		System.out.printf("%s\n", l);

		Collections.sort(l, Collections.reverseOrder());

		System.out.printf("%s\n", l);
	}
}