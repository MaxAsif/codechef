import java.util.*;
import java.util.LinkedList;

class listtoarray
{
	public static void main(String[] args) {
		String[] str = {"B","C","D","E"};
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(str));

		list.add("F");
		list.addFirst("A");

		str = list.toArray(new String[list.size()]);

		for(String s: str)
		{
			System.out.printf("%s ",s);
		}
	}
}