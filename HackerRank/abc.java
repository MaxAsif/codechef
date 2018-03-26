import java.util.*;
class abc
{
	public static void main(String[] args) {
		Character[] a = {'a','f','d'};
		List<Character> l = Arrays.asList(a);
		System.out.printf("Original : %s\n", l);

		Collections.reverse(l);
		System.out.printf("Reverse : %s\n", l);

		Character[] newa = new Character[3];
		List<Character> newl = Arrays.asList(newa);

		Collections.copy(newl, l);
		System.out.printf("Copy : %s\n", newl);

		Collections.fill(l,'X');
		System.out.printf("Fill : %s\n", l);
	}
}