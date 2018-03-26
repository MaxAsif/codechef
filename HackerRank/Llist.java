import java.util.*;
import java.util.LinkedList;

public class Llist
{
	public static void main(String[] args) {
		String[] things = {"Apple","Samsung","Data","Batman"};
		String[] morethings = {"Mango","Blue","Darkmatter"};
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
		for(String x : things){
			list1.add(x);

		}
		for(String y : morethings){
			list2.add(y);
			
		}
		list1.addAll(list2);
		list2 = null;

		printMe(list1);
		removeStuff(list1,2,5);
		printMe(list1);
		reverseMe(list1);
	}
	private static void printMe(List<String> l){
		for(String s : l){
			System.out.printf("%s ", s);

		}
		System.out.println();

	}
	private static void removeStuff(List<String> l, int from, int to){
		l.subList(from, to).clear();

	}
	private static void reverseMe(List<String> l){
		ListIterator<String> it = l.listIterator(l.size());
		while(it.hasPrevious()){
			System.out.printf("%s ", it.previous());
		}
		System.out.println();
	}
}
