import java.util.*;
class Iteration
{
	public static void main(String[] args) {
		String[] things = {"Apple","Mango","Data","ML"};
		List<String> list1 = new ArrayList<String>();
		for(String item: things){
			list1.add(item);
		}
		String[] morethings = {"Mango","Data"};
		List<String> list2 = new ArrayList<String>();
		for(String item: morethings){
			list2.add(item);
		}
		for (int i=0;i<list1.size() ;i++ ) {
			System.out.printf("%s ",list1.get(i));
		}
		editlist(list1, list2);
		System.out.println();
		for (int i=0;i<list1.size() ;i++ ) {
			System.out.printf("%s ",list1.get(i));
		}
	}
	public static void editlist(List<String>l1,List<String>l2){
		Iterator<String> it = l1.iterator();
		while(it.hasNext())
		{
			if(l2.contains(it.next()))
				it.remove();
		}
	}
}